package com.sazakimaeda.spring.newTest.things;

import com.sazakimaeda.spring.newTest.Components;
import org.springframework.stereotype.Component;

@Component
public class GPU implements Components {
    @Override
    public String getName(){ return "RTX 3050"; }
    @Override
    public int getPrice() { return 30000; }
}
