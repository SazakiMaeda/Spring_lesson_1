package com.sazakimaeda.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RatingStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        RaitingList raitingList = context.getBean("raitingList", RaitingList.class);
        raitingList.start();
        context.close();
    }
}
