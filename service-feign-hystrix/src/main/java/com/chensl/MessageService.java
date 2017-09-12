package com.chensl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dickens on 2017/9/12.
 */
@FeignClient(value = "service-a",fallback = MessageServiceHystrix.class)
public interface MessageService {
    @RequestMapping( value = "/message",method = RequestMethod.GET)
    String getMessageFromServiceA();
}
