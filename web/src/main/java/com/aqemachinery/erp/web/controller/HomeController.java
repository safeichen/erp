package com.aqemachinery.erp.web.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public String index() {
        System.out.println("index");
        return "index";
    }

}
