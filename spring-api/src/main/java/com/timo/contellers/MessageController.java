package com.timo.contellers;

import com.timo.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/timo")
    public Message iAmTimo() {
        return new Message("I am timo T");
    }
}
