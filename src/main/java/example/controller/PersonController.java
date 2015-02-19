package example.controller;

import example.PersonService;
import example.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    @ResponseBody
    public Person createSamplePerson() {
        return personService.save(getSamplePerson());
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Person> all() {
        return personService.all();
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable Long id) {
        personService.delete(id);
    }

    private Person getSamplePerson() {
        Person person = new Person();
        person.setFirstName("Stefan");
        person.setLastName("Lundberg");
        return person;
    }
}