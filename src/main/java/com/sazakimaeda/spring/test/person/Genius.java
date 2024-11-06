package com.sazakimaeda.spring.test.person;

import com.sazakimaeda.spring.test.Ratings;

public class Genius implements Ratings {
    @Override
    public String getName() { return "Anton"; }
    @Override
    public int getRating() { return 5; }
}
