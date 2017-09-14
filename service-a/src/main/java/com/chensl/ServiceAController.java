package com.chensl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dickens on 2017/9/11.
 */
@RestController

public class ServiceAController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${version}")
    private String version;


    @RequestMapping("/serviceInfo")
    public String getServiceInfo() {
        String info = getLocalInstanceInfo();
        return info;
    }


    @RequestMapping("/version")
    public String getVersion() {
        return version;
    }

    private String getLocalInstanceInfo() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + "@"
                + serviceInstance.getHost() + ":"
                + serviceInstance.getPort();
    }

    @RequestMapping("/registered")
    public String getRegisteredByName(@RequestParam String name) {
        StringBuffer sb = new StringBuffer();
//        List<ServiceInstance> list = discoveryClient.getInstances(name);
        for (String s : discoveryClient.getServices()) {
            if (name != null && name != "" && !name.equalsIgnoreCase(s)) {
                continue;
            }

            sb.append("services name:" + s + "</br>");
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
            for (int i=0;i<serviceInstances.size();i++) {
                ServiceInstance si = serviceInstances.get(i);
                sb.append(" instance " + i +"</br>");
                sb.append(" Host=" + si.getHost() + "</br>");
                sb.append(" Port=" + si.getPort() + "</br>");
                sb.append(" ServiceId=" + si.getServiceId() + "</br>");
                sb.append(" Uri=" + si.getUri() + "</br>");
                sb.append("</br>");
            }
            sb.append("</br>");
        }

        return sb.toString();
    }
}
