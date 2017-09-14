package com.chensl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Dickens on 2017/9/12.
 */
@FeignClient(value = "service-a")
public interface InfoService {
    @RequestMapping( value = "/serviceInfo",method = RequestMethod.GET)
    String getServiceInfoFromServiceA();

    @RequestMapping( value = "/registered",method = RequestMethod.GET)
    String getRegisteredByNameFromServiceA(@RequestParam(value = "name") String name);
}
