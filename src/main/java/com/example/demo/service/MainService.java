package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MainService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void test(){
        jdbcTemplate.execute("select * from user;");
    }

    public void insert(){
        jdbcTemplate.execute("INSERT INTO user VALUES ('3', '232', 10);");
    }
}
