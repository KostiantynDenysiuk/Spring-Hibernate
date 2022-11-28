package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheHappiestFortuneServiceApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextNew.xml");

        TheHappiestFortuneService happiestFortuneService =
                context.getBean("myHappiestFortune", TheHappiestFortuneService.class);

        System.out.println(happiestFortuneService.getFortune());

        context.close();

    }
}
