package com.sazakimaeda.spring.janr;

import com.sazakimaeda.spring.Music;
import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() { return "ACDC"; }
}
