package com.eazybank.demoeazybank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {


    @GetMapping("/details")
    public String getAccountsDetails(){
            return "[Account]:: Here are the account details without using DB yet";
    }
}
