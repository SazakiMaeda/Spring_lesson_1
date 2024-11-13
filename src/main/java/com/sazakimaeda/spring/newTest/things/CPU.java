package com.sazakimaeda.spring.newTest.things;

import com.sazakimaeda.spring.newTest.Components;
import org.springframework.stereotype.Component;

@Component
public class CPU implements Components {
    @Override
    public String getName() { return "AMD"; }
    @Override
    public int getPrice() { return 500; }
}
