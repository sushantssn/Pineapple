package com.pineapple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthenticationController {

@RequestMapping({"/hello"})
    public String hello(){

    return "Hello Welcome";
}

}
