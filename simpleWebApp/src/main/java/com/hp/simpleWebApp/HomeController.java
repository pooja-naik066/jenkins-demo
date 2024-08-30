package com.hp.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController    //restcontroller  --send only data to client..not layout
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome Home";
    }
}
