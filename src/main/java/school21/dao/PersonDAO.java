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

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(person.getName());
    }

    public void delete(int id) {
        Person personToBeDeleted = show(id);

        people.remove(personToBeDeleted);
    }
}
