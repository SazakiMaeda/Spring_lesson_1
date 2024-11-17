package lesson1.test.person;

import lesson1.test.Ratings;
import org.springframework.stereotype.Component;

@Component
public class Debil implements Ratings {
    @Override
    public String getName(){ return "Debil"; }
    @Override
    public int getRating(){ return 2; }

    public void Init() { System.out.println("Initializing Genius..."); }
    private void Destroy() { System.out.println("Destroying Genius..."); }
}
