package com.eazybank.demoeazybank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/balances")
public class BalanceController {
    @GetMapping("/details")
    public String getBalancesDetails(){
        return "[Balance]:: Here are the balance details without using DB yet";
    }
}
