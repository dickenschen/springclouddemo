package com.chensl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dickens on 2017/9/12.
 */
@RestController
public class InfoController {
    @Autowired
    InfoService infoService;

    @RequestMapping(value ="/serviceInfo",method = RequestMethod.GET)
    String getServiceInfo(){
        return infoService.getServiceInfoFromServiceA();
    }

    @RequestMapping(value ="/registered",method = RequestMethod.GET)
    String getRegisteredByName(@RequestParam String name){
        return infoService.getRegisteredByNameFromServiceA(name);
    }
}
