package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //Call methods on bean
        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());
        System.out.println(theCricketCoach.getEmailAddress());
        System.out.println(theCricketCoach.getTeam());
        //Close the context
        context.close();
    }

}
