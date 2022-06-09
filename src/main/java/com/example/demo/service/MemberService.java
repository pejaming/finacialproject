package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List selectALL() {
        List userList = jdbcTemplate.queryForList("select * from user;");
        return userList;
    }

    public void insert() {
        jdbcTemplate.execute("INSERT INTO user VALUES ('3', '232', 10);");

    }
}