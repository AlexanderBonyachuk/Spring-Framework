package ru.bonyachuk.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.bonyachuk.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
// Class acting as Database
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tommi"));
        people.add(new Person(++PEOPLE_COUNT, "Bobi"));
        people.add(new Person(++PEOPLE_COUNT, "Miki"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return  people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
