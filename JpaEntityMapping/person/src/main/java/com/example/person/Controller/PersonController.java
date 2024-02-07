package com.example.person.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.Entity.Person;
import com.example.person.Servive.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/persons")

public class PersonController {
    @Autowired
    private PersonService personService;
@GetMapping
public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public Optional<Person> getById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
@PostMapping
public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }
@DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id)
    {
        personService.deletePerson(id);
    }
}