package com.chensl;

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

    public String getServiceInfoFromServiceA() {
        return restTemplate.getForObject("http://SERVICE-A/serviceInfo",String.class);
    }

    public String getRegisteredByNameFromServiceA(String name) {
        return restTemplate.getForObject("http://SERVICE-A/registered?name="+name,String.class);
    }
}
