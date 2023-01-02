package com.eazybank.demoeazybank.controller;

import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notices")
public class NoticesController {
    @GetMapping("/details")
    public String getLoansDetails(){

        return "[Notices]:: Here are the Notices details without using DB yet";
    }
}
