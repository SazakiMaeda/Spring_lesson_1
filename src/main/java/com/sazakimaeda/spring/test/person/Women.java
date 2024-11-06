package com.sazakimaeda.spring.test.person;

import com.sazakimaeda.spring.test.Ratings;

public class Women implements Ratings {
    @Override
    public String getName() { return "Natasha"; }
    @Override
    public int getRating() { return 3;}
}
