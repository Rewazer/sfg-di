package ru.hcc.sfgdi.controllers;

/*
 * Created by SS on  16/05/2020
 */

import org.springframework.stereotype.Controller;
import ru.hcc.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
