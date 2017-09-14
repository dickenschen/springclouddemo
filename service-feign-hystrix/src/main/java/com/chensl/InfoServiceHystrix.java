package com.chensl;

import org.springframework.stereotype.Component;

/**
 * Created by Dickens on 2017/9/12.
 */
@Component
public class InfoServiceHystrix implements InfoService {
    @Override
    public String getServiceInfoFromServiceA(){
        return "get message service error";
    }
    @Override
    public String getRegisteredByNameFromServiceA(String name){
        return "get message service error";
    }
}
