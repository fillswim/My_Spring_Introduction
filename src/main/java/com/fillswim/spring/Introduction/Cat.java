package com.fillswim.spring.Introduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Myu-Myu");
    }
}
