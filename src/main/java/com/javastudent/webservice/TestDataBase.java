package com.javastudent.webservice;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDataBase {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public TestDataBase(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @GetMapping("/database")
    public boolean isDatabaseConnected() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
class User {
    public String ContactID;
    public String FirstName;
    public String LassName;
}
