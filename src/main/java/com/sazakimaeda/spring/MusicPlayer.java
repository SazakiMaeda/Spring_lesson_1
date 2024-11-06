package com.sazakimaeda.spring;

import com.sazakimaeda.spring.janr.ClassicalMusic;
import com.sazakimaeda.spring.janr.RapMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
   private RapMusic rapMusic;
    private Music music;
//    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

//IoC - ДЛЯ ВСЕГО
//    @Autowired
//    public MusicPlayer(Music Music) { this.music = Music; }

// IoC - только для ClassicalMusic and RapMusic
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }

// Если у меня есть созданный конструктор, то джава УДАЛЯЕТ
// пустой конструткор и пользуется моим созданным. Выше создан конструктор,
// куда я передал парамертры Music music и устанавливал переменные,
// тут же я делаю это пустым конструтором, но у я обращаюсь к setMusic,
// чтобы установить переменную music.
    public MusicPlayer() {}

// Я создал новый бин, в котором прописал id, class,
// а так же новое для себя - это
// <property name="music" ref="musicBean"/>
// Эта строчка означает, что он ищет setMusic
// и устанавливает переменную и устанавливает
// зависимость MusicPlayer с ref="musicBean"/>
// property задаёт какие зависимости нужно внедрить.

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }


// Я получается из интерфейса Music взял переменные
// и положил их в arraylist musicList и выывел их на экран
    public void playMusic() {
//        for (Music music : musicList) {
            System.out.println("Playing music: " + classicalMusic.getSong());
            System.out.println("Playing music: " + rapMusic.getSong());
//        }
    }

// С помощью геттера я могу выводить имя
    public String getName() { return name; }
// Сет устанавливает имя, устанавливается через xlm
// Короче я в xlm прописал строчку с помощью property
// <property name="name" value="Face"/>
// Устанавилваем переменной "name" значение "Face"
    public void setName(String name) { this.name = name; }
// Снова выводим имя с помощью геттера
    public int getVolume() { return volume; }
// Устанавилваем значения с помощью property
// <property name="volume" value="50"/>
    public void setVolume(int volume) { this.volume = volume;}
// Если я хочу устаноавить эти значения, но не через
// XLM, как указывал выше, а через файл, допустим как я указал
// через musicPlayer.properties, то мне нужно сначала добавить файл в XML
//  <context:property-placeholder location="classpath:musicPlayer.properties"/>
// Мы ищем файл по нашей директории, в данном случае он находится в classpath,
// а в нём мы указываем значения, например, указали musicPlayer.volume=70
// А чтобы обратиться к этому значению, всё тоже самое как и выше
// <property name="name" value="Face"/> , но мы должны изменить значение Face на
// ${musicPlayer.volume} Обращение ко всем таким значениям только через ${переменная}.
}
