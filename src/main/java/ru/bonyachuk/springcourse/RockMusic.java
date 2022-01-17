package ru.bonyachuk.springcourse;

import org.springframework.stereotype.Component;
import java.util.concurrent.ThreadLocalRandom;

public class RockMusic implements Music {
    private String[] musicMass = {
            "Rock Music 1",
            "Rock Music 2",
            "Rock Music 3"
    };

    @Override
    public String getsong() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return musicMass[random.nextInt(musicMass.length)];
    }
}
