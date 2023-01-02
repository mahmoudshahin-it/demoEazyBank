package com.eazybank.demoeazybank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/loans")
public class LoansController {

    @GetMapping("/details")
    public String getLoansDetails(){
        return "[Loans]:: Here are the Loans details without using DB yet";
    }
}
