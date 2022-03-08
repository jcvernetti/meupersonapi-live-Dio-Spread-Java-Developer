package one.digitalinnovation.meupersonapi.controller;

import one.digitalinnovation.meupersonapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.meupersonapi.entity.Person;
import one.digitalinnovation.meupersonapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO creatPerson(@RequestBody Person person){
        return personService.creatPerson(person);
    }
}
