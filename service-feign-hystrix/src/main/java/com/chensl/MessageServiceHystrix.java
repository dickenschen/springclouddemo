package com.chensl;

import org.springframework.stereotype.Component;

/**
 * Created by Dickens on 2017/9/12.
 */
@Component
public class MessageServiceHystrix implements  MessageService{
    @Override
    public String getMessageFromServiceA(){
        return "get message service error";
    }
}
