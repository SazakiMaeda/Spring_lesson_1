package lesson1.test.person;

import lesson1.test.Ratings;
import org.springframework.stereotype.Component;

@Component
public class Genius implements Ratings {
    @Override
    public String getName() { return "Anton"; }
    @Override
    public int getRating() { return 5; }
}
