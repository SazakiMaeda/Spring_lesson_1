package lesson1.newTest.things;

import lesson1.newTest.Components;
import org.springframework.stereotype.Component;

@Component
public class CPU implements Components {
    @Override
    public String getName() { return "AMD"; }
    @Override
    public int getPrice() { return 500; }
}
