package com.sazakimaeda.spring.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//я добавил в applicationContext зависимость и вызвал их следующей строчкой.
//Я создал в xml файле новый бин, в котором прописал musicPlayer - бин id,
//а также прописал путь до класса, то есть MusicPlayer.
//<constructor-arg ref="musicBean"/> - это передача аргумента в musicBean,
//чтобы musicPlayer мог работать с musicBean.

//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//То что я вызвал вместо 2 верхних строчек
//        MusicPlayer musicPlayer = context.getBean("classicalMusic", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println("Исполнитель: " + musicPlayer.getName());
//        System.out.println("Громкость установлена: " + musicPlayer.getVolume());

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
            musicPlayer.playMusic();
        context.close();
    }
}
