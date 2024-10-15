package com.beshoy.mvc.thymeleafpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    // new a controller method to show the initial form
    @RequestMapping("/showform")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the form
@RequestMapping("/processform")
    public String processForm(){
        return "helloworld";
}

}
