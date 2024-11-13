package com.sazakimaeda.spring.music.janr;

import com.sazakimaeda.spring.music.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){ return new ClassicalMusic();}

    @PostConstruct
    private void doMyInit() { System.out.println("Делаю инициализацию..."); }
    @PreDestroy
    private void doMyDestroy() { System.out.println("Делаю уничтожение...");}

    @Override
    public String[] getSong() {
        String[] classicalMusic = {"1 song ", "2 song ", "3 song"};
        return classicalMusic;
    }
}