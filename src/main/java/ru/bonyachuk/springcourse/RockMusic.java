package ru.bonyachuk.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getsong() {
        return "Wind cries Mary";
    }
}
