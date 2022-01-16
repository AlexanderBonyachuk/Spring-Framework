package ru.bonyachuk.springcourse;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class ClassicalMusic implements Music {
    private String[] musicMass = {
            "Classic Music 1",
            "Classic Music 2",
            "Classic Music 3"
    };

    @Override
    public String getsong() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return musicMass[random.nextInt(musicMass.length)];
    }
}
