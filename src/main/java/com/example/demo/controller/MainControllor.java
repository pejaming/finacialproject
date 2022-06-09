package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainControllor {

    @Autowired
    private MemberService memberService;

    @GetMapping("/insert")
    public String insertName()
    {
        memberService.insert();
        return "xxx";
    }

    @GetMapping("/selectall")
    public void getName()
    {
        List memberList = memberService.selectALL();

    }
}
