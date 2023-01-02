package com.eazybank.demoeazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {
    @GetMapping("/details")
    public String getContactsDetails(){
        return "[Contacts]:: Here are the Contacts details without using DB yet";
    }
}
