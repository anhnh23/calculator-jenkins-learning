package com.leszko.calculator.service;

import org.springframework.stereotype.Service;

/**
 * Services
 */
@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
