package lesson1.test.person;

import lesson1.test.Ratings;
import org.springframework.stereotype.Component;

@Component
public class Man implements Ratings {
    @Override
    public String getName(){ return "Pasha";}
    @Override
    public int getRating(){ return 5; }
}
