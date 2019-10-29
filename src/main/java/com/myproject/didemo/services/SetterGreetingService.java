package com.myproject.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello - Iwas injected by the setter";
    }
}
