package com.devteria.hello_spring_boot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloStringController {
       @GetMapping("/hello")
       String SayHello(){
           return "Hello Bro";
       }

}
