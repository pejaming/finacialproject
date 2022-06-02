package com.example.demo.controller;

import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllor {

    @Autowired
    private MainService mainService;

    @GetMapping("/name")
    public String getName()
    {
        mainService.insert();
        return "xxx";
    }
}
