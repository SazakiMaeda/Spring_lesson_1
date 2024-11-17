package lesson1.newTest;

import lesson1.newTest.config.Info;
import lesson1.newTest.config.SpringConfig;
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
