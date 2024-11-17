package lesson1.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//    private RapMusic rapMusic;

    private Music music1;
    private Music music2;
//    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

//IoC - ДЛЯ ВСЕГО
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

// IoC - только для ClassicalMusic and RapMusic
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rapMusic = rapMusic;
//    }

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
        System.out.println("Громкость " + volume + " Исполнитель: " + name);
        for (String music: music1.getSong()) {
            System.out.println("Playing music: " + music);
        }
        for (String music: music2.getSong()) {
            System.out.println("Playing music: " + music);
        }
    }

// С помощью геттера я могу выводить имя
    public String getName() { return name; }
// Сет устанавливает имя, устанавливается через xlm
// Короче я в xlm прописал строчку с помощью property
// <property name="name" value="Face"/>
// Устанавилваем переменной "name" значение "Face"
@Value("${musicPlayer.name}")
    public void setName(String name) { this.name = name; }
// Снова выводим имя с помощью геттера
    public int getVolume() { return volume; }
// Устанавилваем значения с помощью property
// <property name="volume" value="50"/>
@Value("${musicPlayer.volume}")
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
