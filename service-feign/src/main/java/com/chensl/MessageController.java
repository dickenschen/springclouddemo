package com.chensl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dickens on 2017/9/12.
 */
@RestController
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value ="/message",method = RequestMethod.GET)
    String getMessage(){
        return messageService.getMessageFromServiceA();
    }
}
