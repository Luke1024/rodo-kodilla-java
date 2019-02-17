package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = (Calculator) context.getBean("calculator");

        Assert.assertEquals(calculator.add(5,3),8, 0.001);

        Assert.assertEquals(calculator.sub(6,3),3, 0.001);

        Assert.assertEquals(calculator.mul(5,4),20,0.001);

        Assert.assertEquals(calculator.div(9,3),3,0.001);
    }
}
