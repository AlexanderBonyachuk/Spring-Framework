package ru.bonyachuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private  String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;
    private String playingMusic = "Playing: ";

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(GenreOfMusic genMusic) {
        if (genMusic == GenreOfMusic.CLASSICAL) {
            playingMusic += musicList.get(1).getsong();
        }
        if (genMusic == GenreOfMusic.ROCK) {
            playingMusic += musicList.get(2).getsong();
        }
        if (genMusic == GenreOfMusic.JAZZ) {
            playingMusic += musicList.get(3).getsong();
        }
        return playingMusic;
    }
}
