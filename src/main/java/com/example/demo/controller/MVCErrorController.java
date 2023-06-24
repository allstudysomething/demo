package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MVCErrorController implements ErrorController {

    @RequestMapping("/error")
    public String errorMessage() {
        log.info("***** in error controller *****");
        return "error";
    }

}
