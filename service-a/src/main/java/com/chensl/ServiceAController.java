package com.chensl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dickens on 2017/9/11.
 */
@RestController
public class ServiceAController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/")
    public String home(){
        return "service-a";
    }
    @RequestMapping("/message")
    public String getMessage() {
        String message = getLocalInstanceInfo();
        return message;
    }

    private String getLocalInstanceInfo(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + "@"
                + serviceInstance.getHost() + ":"
                + serviceInstance.getPort();
    }
}
