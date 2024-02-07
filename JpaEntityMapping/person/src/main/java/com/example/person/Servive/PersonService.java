package com.example.person.Servive;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.Entity.Person;
import com.example.person.Respository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id)
    {
        return personRepository.findById(id);
    }
    public Person savePerson(Person person)
    {
        return personRepository.save(person);

    }
    public void deletePerson(Long id)
    {
        personRepository.deleteById(id);
    }
}
