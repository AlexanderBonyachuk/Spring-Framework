package ru.bonyachuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private  String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;
    private String playingMusic = "Playing: ";

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(
            @Qualifier("rockMusic") Music music1,
            @Qualifier("classicalMusic")  Music music2
    ) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(GenreOfMusic genMusic) {
        if (genMusic == GenreOfMusic.CLASSICAL) {
            playingMusic += music1.getsong();
        }
        if (genMusic == GenreOfMusic.ROCK) {
            playingMusic += music2.getsong();
        }
        return playingMusic;
    }
}
