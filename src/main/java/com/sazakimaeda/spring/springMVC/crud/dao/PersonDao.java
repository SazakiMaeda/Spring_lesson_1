package com.sazakimaeda.spring.springMVC.crud.dao;

import com.sazakimaeda.spring.springMVC.crud.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private static int PEOPLE_COUNT;
    private static List<Person> people;
    {
        people = new ArrayList<Person>();

        people.add(new Person("Anton", PEOPLE_COUNT++, "EtoYa", 5, "lox@mail.ru"));
        people.add(new Person("Bob", PEOPLE_COUNT++, "lox", 32, "bob@mail.ru"));
        people.add(new Person("Dan", PEOPLE_COUNT++, "Gay",2, "gay@bk.ru"));
        people.add(new Person("Jack", PEOPLE_COUNT++, "Pidr",555, "jack@yandex.ru.ru"));
        people.add(new Person("John", PEOPLE_COUNT++, "Foxybloke",-1, "john@gmail.com"));

    }

    public List<Person> index() { return people; }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setSurname(updatedPerson.getSurname());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
