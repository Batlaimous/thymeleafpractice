package com.beshoy.mvc.thymeleafpractice.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


// need a controller mothod to read from data
// add data to the model
@RequestMapping("/processformv2")
    public String letShoutDude(HttpServletRequest request, Model model){

        // read request paarms from html form
String theName =request.getParameter("studentName");

    // convert the data to upper case
theName = theName.toUpperCase();
    // create the message
String result = " Yo! " + theName;
    // add message to the model
model.addAttribute("message", result);

        return "helloworld";
    }


    @RequestMapping("/processformv3")
    public String processFormv3(@RequestParam("studentName") String theName,
                                Model model){

        // convert the data to upper case
        theName = theName.toUpperCase();
        // create the message
        String result = " Yo yooo yoooo messing you! " + theName;
        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
