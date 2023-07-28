package school21.dao;

import org.springframework.stereotype.Component;
import school21.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private final List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Andrey"));
        people.add(new Person(++PEOPLE_COUNT, "Bill"));
        people.add(new Person(++PEOPLE_COUNT, "Elyse"));
        people.add(new Person(++PEOPLE_COUNT, "Ann"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
