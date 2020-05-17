package ru.hcc.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hcc.sfgdi.services.ConstructorGreetingService;

/*
 * Created by SS on  16/05/2020
 */

class ConstructorInjectedControllerTest {
ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}