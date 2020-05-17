package ru.hcc.sfgdi.services;

import org.springframework.stereotype.Service;

/*
 * Created by SS on  16/05/2020
 */

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
