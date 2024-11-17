package lesson1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class RaitingList {
    private List<Ratings> ratings = new ArrayList<>();
    private double midleRaiting;

    @Autowired
    public void setRatings (List<Ratings> ratings) {
        this.ratings = ratings;
    }

    public void start() {
        for(Ratings rat : ratings) {
            System.out.println("Ваше имя: " + rat.getName());
            System.out.println("Ваш рейтинг: " + rat.getRating());
            System.out.println("====================");
            midleRaiting += rat.getRating();
        }
        midleRaiting = (midleRaiting / ratings.size());
        System.out.println("Средний рейтинг: " + midleRaiting);
    }

    private void Init() { System.out.println("Initializing Genius..."); }
    private void Destroy() { System.out.println("Destroying Genius..."); }
}
