package com.chensl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dickens on 2017/9/11.
 */
@RestController
public class InfoController {
    @Autowired
    InfoService infoService;

    @RequestMapping("/serviceInfo")
    String getServiceInfo(){
        return infoService.getServiceInfoFromServiceA();
    }

    @RequestMapping("/registered")
    String getRegisteredByName(@RequestParam String name){
        return infoService.getRegisteredByNameFromServiceA(name);
    }
}
