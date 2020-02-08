package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class CalculatorTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before all setup method called");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("Before each setup method called");
    }

    @DisplayName("Add operation test")
    @RepeatedTest(5)
    public void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(2, 2);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDownEach(){
        System.out.println("After each tear down method called");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("After all tear down method called");
    }

}