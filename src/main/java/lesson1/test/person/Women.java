package lesson1.test.person;

import lesson1.test.Ratings;
import org.springframework.stereotype.Component;

@Component
public class Women implements Ratings {
    @Override
    public String getName() { return "Natasha"; }
    @Override
    public int getRating() { return 3;}
}
