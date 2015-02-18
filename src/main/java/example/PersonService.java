package example;

import example.domain.Person;
import example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by stefanlundberg on 15-02-18.
 */

@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void save(Person person) {
        personRepository.save(person);
    }

}
