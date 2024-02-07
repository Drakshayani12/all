package com.ltimindtree.firstproject.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.firstproject.entity.HelloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class FirstProject {

    @GetMapping("/hello")
    public String hello()
    {
        return "Welcome to EBIL java Spring boot Project";
    }

    
    @GetMapping("/hello-world")
    
    
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello world");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
@GetMapping("/hello-world/path-variable1/{num}")

    public HelloWorldBean helloWorldSum(@PathVariable int num)
    {
        return new HelloWorldBean(String.format("num is %d ",num));
    }

    @GetMapping("/hello-world/path-variable/{num1}/{num2}")
    public HelloWorldBean helloSum(@PathVariable int num1,@PathVariable int  num2)
    {
        int sum = num1+num2;
        return new HelloWorldBean(String.format("sum is %d",sum));
    }
}
