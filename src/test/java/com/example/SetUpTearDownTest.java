package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetUpTearDownTest {

    @BeforeAll
    public static void setUp1(){
        System.out.println("Run before all test method");
    }

    @BeforeEach
    public void setUp2(){
        System.out.println("Run before each test method");
    }

    @Test
    public void addTest(){
        Assertions.assertEquals(2, 1+1);
    }

    @Test
    public void divideTest(){
        Assertions.assertEquals(4, 8/2);
    }

    @AfterEach
    public void tearDown2(){
        System.out.println("Run after each test method");
    }

    @AfterAll
    public static void tearDown1(){
        System.out.println("Run after all test method is executed");
    }
}
