package com.chensl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dickens on 2017/9/11.
 */
@Service
public class InfoService {
    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "getServiceInfError")
    public String getServiceInfoFromServiceA() {
        return restTemplate.getForObject("http://SERVICE-A/serviceInfo",String.class);
    }
    @HystrixCommand(fallbackMethod = "getRegisteredByNameError")
    public String getRegisteredByNameFromServiceA(String name) {
        return restTemplate.getForObject("http://SERVICE-A/registered?name="+name,String.class);
    }

    public  String getServiceInfError(){
        return  "get message service error";
    }

    public  String getRegisteredByNameError(String name){
        return  "get message service error";
    }
}
