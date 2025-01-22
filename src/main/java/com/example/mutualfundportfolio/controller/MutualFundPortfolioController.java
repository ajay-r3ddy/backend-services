package com.example.mutualfundportfolio.controller;

import com.example.mutualfundportfolio.pojo.MutualFundPortfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mutualfundsportfolio")
public class MutualFundPortfolioController {

    private final JdbcTemplate jdbcTemplate;

    private final DataSource dataSource;

    @Autowired
    public MutualFundPortfolioController(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }


    @GetMapping("/retrieve")
    public List<Map<String, Object>> retrieveData() {
        String query = "SELECT * FROM mutual_fund_portfolio";
        return jdbcTemplate.queryForList(query);
    }

    @PostMapping("/insertData")
    public String insertDataIntoTable(@RequestBody MutualFundPortfolio mutualFundPortfolio){
        String query = "INSERT INTO mutual_fund_portfolio(table_id, scheme_code, scheme_name, isin_growth, isin_div_reinvestment) VALUES (?, ?, ?, ?, ?)";
        int rows = jdbcTemplate.update(query, mutualFundPortfolio.getTable_id(), mutualFundPortfolio.getScheme_code(), mutualFundPortfolio.getScheme_name(),
                        mutualFundPortfolio.getIsin_growth(), mutualFundPortfolio.getIsin_div_reinvestment());
        return rows > 0 ? "User added successfully" : "Failed to add user";
    }

    @DeleteMapping("/delete/{schemaCode}")
    public String deleteDataFromTable(@PathVariable int schemaCode){
        String query = "DELETE FROM mutual_fund_portfolio where scheme_code = ?";
        int rows = jdbcTemplate.update(query, schemaCode);
        return rows > 0 ? "User deleted successfully" : "Failed to delete user";
    }
}
