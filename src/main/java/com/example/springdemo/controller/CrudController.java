package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {

    @GetMapping("/CRUD")
    public String CRUD() {
        return "CRUD";
    }
}
