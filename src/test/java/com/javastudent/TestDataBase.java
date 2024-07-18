package com.javastudent;


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
    @GetMapping("/health")
    public ResponseEntity<String> checkDatabaseConnection() {
        try {
            jdbcTemplate.queryForObject("SELECT 1 FROM users", Integer.class);
            return ResponseEntity.ok("Database connection is successful.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to connect to the database." + "Loi: " + e);
        }
    }
}

