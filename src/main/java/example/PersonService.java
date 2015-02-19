package example;

import com.google.common.collect.Lists;
import example.domain.Person;
import example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by stefanlundberg on 15-02-18.
 */

@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> all() {
        return Lists.newArrayList(personRepository.findAll());
    }

    public void delete(Long id) {
        try {
            personRepository.delete(id);
        } catch (EmptyResultDataAccessException exception) {
            System.out.println("no such id exists"); //TODO replace with logger
        }
    }

}
