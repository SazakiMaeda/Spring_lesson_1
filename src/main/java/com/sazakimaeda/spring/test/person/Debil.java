package com.sazakimaeda.spring.test.person;

import com.sazakimaeda.spring.test.Ratings;

public class Debil implements Ratings {
    @Override
    public String getName(){ return "Debil"; }
    @Override
    public int getRating(){ return 2; }

    private void Init() { System.out.println("Initializing Genius..."); }
    private void Destroy() { System.out.println("Destroying Genius..."); }
}
