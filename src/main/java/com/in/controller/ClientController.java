package com.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @RequestMapping("/clients")
    public String printClients() {
        return "Clients";
    }
}
