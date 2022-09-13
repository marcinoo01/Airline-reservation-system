package com.mmistela.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class AppUserController {
    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public String getApp() {
        return "auth";
    }
}
