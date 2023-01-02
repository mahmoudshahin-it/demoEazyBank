package com.eazybank.demoeazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cards")
public class CardsController {
    @GetMapping("/details")
    public String getCardsDetails(){
        return "[Cards]:: Here are the cards details without using DB yet";
    }

}
