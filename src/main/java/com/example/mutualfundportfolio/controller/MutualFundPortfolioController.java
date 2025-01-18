package com.example.mutualfundportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mutualfundsportfolio")
public class MutualFundPortfolioController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MutualFundPortfolioController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/retrieve")
    public List<Map<String, Object>> retrieveData() {
        String query = "SELECT * FROM your_table"; // Replace 'your_table' with your actual table name
        return jdbcTemplate.queryForList(query);
    }

}
