package com.qf.controller;

import com.qf.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   /* @Value("${com.name}")
    private String name;*/

   @Autowired
   private Person person;

    @RequestMapping("/hello")
    public String hello(){

        return "对象"+person;
    }
}
