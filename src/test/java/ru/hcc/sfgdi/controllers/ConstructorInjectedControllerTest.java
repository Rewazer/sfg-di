package ru.hcc.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hcc.sfgdi.services.GreetingServiceImpl;

/*
 * Created by SS on  16/05/2020
 */

class ConstructorInjectedControllerTest {
ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}