package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return hellow "World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/test")
    public String sayTest(){
        return "Hello Test!";
    }

    //exose a nw endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout (){ return "Run a hard 10k"; }

    @GetMapping("/fortune")
    public String getDailyFortune() { return "You are Lucky";}

}
