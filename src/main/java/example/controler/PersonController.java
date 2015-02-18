package example.controler;

import example.PersonService;
import example.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import example.repository.PersonRepository;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    @ResponseBody
    public String createSamplePerson() {
        personService.save(getSamplePerson());
        return "hello";
        /*Person person = new Person();
        person.setFirstName("First");
        person.setLastName("Test");
        personRepository.save(person);
        return "hello";*/
    }

    private Person getSamplePerson() {
        Person person = new Person();
        person.setFirstName("Stefan");
        person.setLastName("Lundberg");
        return person;
    }
}