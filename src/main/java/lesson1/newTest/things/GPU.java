package lesson1.newTest.things;

import lesson1.newTest.Components;
import org.springframework.stereotype.Component;

@Component
public class GPU implements Components {
    @Override
    public String getName(){ return "RTX 3050"; }
    @Override
    public int getPrice() { return 30000; }
}
