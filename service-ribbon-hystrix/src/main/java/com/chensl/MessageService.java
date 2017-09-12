package com.chensl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dickens on 2017/9/11.
 */
@Service
public class MessageService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getMessageError")
    public String getMessageFromServiceA() {
        return restTemplate.getForObject("http://SERVICE-A/message",String.class);
    }

    public  String getMessageError(){
        return  "get message service error";
    }
}
