package com.sazakimaeda.spring.newTest;

import com.sazakimaeda.spring.newTest.config.Info;
import com.sazakimaeda.spring.newTest.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerStart {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
        Info info = context.getBean(Info.class);
        info.start();
        context.close();
    }
}
