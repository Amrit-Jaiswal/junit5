package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MessageServiceTest {

    @DisplayName("Test MessageService.get()")
    @Test
    public void testGet(){
        MessageService messageService = new MessageService();
        String actual = messageService.get();
        String expected = "Hello Junit 5";
        Assertions.assertEquals(expected, actual);
    }

}