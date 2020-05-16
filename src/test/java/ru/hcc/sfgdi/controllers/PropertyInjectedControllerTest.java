package ru.hcc.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hcc.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    public void setup() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}