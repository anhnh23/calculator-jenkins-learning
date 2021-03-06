package com.leszko.calculator.controller;

import com.leszko.calculator.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    public String num(@RequestParam("a") Integer a,
               @RequestParam("b") Integer b){
        return String.valueOf(calculator.sum(a,b));
    }
}
