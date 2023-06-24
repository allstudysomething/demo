package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class MVCSomeController {

    @RequestMapping("/some1")
    public String someOne() {
        log.info("***** in some1 controller *****");
        return "indexx";
    }
}
