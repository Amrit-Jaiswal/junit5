package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperationSystemTest {

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    public void testOnLinuxOrWindows(){
        System.out.println("Run this on linux or windows");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testOnWindows(){
        System.out.println("Run this on windows");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testOnLinux(){
        System.out.println("Run this on Linux");
    }
}
