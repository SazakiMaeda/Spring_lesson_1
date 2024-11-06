package com.sazakimaeda.spring.janr;

import com.sazakimaeda.spring.Music;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() { return "Rap Music"; }
}
