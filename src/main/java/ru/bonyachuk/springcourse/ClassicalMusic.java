package ru.bonyachuk.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ThreadLocalRandom;

public class ClassicalMusic implements Music {
    private String[] musicMass = {
            "Classic Music 1",
            "Classic Music 2",
            "Classic Music 3"
    };

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization Classic Music");
    }

    @PreDestroy
    public void doMyDesrtroy() {
        System.out.println("Doing my destruction Classic Music");
    }

    @Override
    public String getsong() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return musicMass[random.nextInt(musicMass.length)];
    }
}
