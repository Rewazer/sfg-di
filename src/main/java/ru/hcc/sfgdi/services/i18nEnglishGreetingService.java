package ru.hcc.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Created by SS on 16/05/2020.
 */
@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
