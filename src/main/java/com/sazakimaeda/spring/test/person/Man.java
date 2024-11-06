package com.sazakimaeda.spring.test.person;

import com.sazakimaeda.spring.test.Ratings;

public class Man implements Ratings {
    @Override
    public String getName(){ return "Pasha";}
    @Override
    public int getRating(){ return 5; }
}
