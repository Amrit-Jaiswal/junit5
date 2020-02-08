package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void testExpectedException(){
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    public void testExpectedExceptionWithSuperType(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Integer.parseInt("One");
        });
    }

    @Test
    public void testExpectedExceptionFail(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Integer.parseInt("1");
        });
    }
}
