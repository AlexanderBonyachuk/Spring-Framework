package ru.bonyachuk.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String returnString = "Computer " + id + " " ;

        if (random.nextInt(GenreOfMusic.values().length) == 0) {
            returnString += musicPlayer.playMusic(GenreOfMusic.CLASSICAL);
        } else {
            returnString += musicPlayer.playMusic(GenreOfMusic.ROCK);
        }
        return returnString;
    }
}
