package lesson1.music.janr;

import lesson1.music.Music;
import org.springframework.stereotype.Component;
@Component
public class RockMusic implements Music {
    @Override
    public String[] getSong() {
        String[] rockMusic = {"7 song ", "8 song ", "9 song"};
        return rockMusic;
    }
}
