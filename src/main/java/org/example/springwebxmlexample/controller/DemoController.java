package org.example.springwebxmlexample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloPage")
public class DemoController {

    @GetMapping
    public String sayHello(){
        return "helloPage";
    }
}
