package ru.bonyachuk.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("musicBeanClassic", Music.class);
        MusicPlayer musicPlayerRock = new MusicPlayer(music);
        MusicPlayer musicPlayerClassical = new MusicPlayer(music2);
        musicPlayerRock.playMusic();
        musicPlayerClassical.playMusic();

        context.close();
    }
}