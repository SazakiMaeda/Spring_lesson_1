package lesson1.music.janr;

import lesson1.music.Music;
import org.springframework.stereotype.Component;
@Component
public class RapMusic implements Music {
    @Override
    public String[] getSong() {
        String[] rapMusic = {"4 song ", "5 song ", "6 song"};
        return rapMusic;
    }
}
