package com.leszko.calculator;

import com.leszko.calculator.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
    private Calculator calculator = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2,3));
    }

}
