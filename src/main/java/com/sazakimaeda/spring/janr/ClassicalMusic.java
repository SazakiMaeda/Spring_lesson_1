package com.sazakimaeda.spring.janr;

import com.sazakimaeda.spring.Music;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){ return new ClassicalMusic();}
    private void doMyInit() { System.out.println("Делаю инициализацию..."); }
    private void doMyDestroy() { System.out.println("Делаю уничтожение...");}

    @Override
    public String getSong() { return "Burger"; }
}
