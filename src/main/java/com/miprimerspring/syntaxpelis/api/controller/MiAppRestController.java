package com.miprimerspring.syntaxpelis.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiAppRestController {

    @Value("${custom.message}")
    private String msg;

    @GetMapping("/message")
    public String saludo() {
        return msg;
    }

}
