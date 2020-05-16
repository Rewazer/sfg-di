package ru.hcc.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Created by SS on 16/05/2020.
 */
@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
