package com.example.person.Servive;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.Entity.Passport;
import com.example.person.Entity.Person;
import com.example.person.Respository.PassportRepository;
import com.example.person.Respository.PersonRepository;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepository;

    @Autowired
    private PersonRepository personRepository;

    public List<Passport> getAllPassport(){
        return passportRepository.findAll();
        
    }

    public Optional<Passport> getPassportById(Long id){
        return passportRepository.findById(id);
    }

    public Passport savePassport(Passport passport)
    {

        return passportRepository.save(passport);
    }

    public void deletePassport(Long id)
    {
        passportRepository.deleteById(id);
    }
   // PassportService ps = new PassportService();
   public Passport savePersonExisting(Passport passport)
   {
    Passport p = new Passport();
    p.setCountry(passport.getCountry());
    p.setIssueDate(passport.getIssueDate());
    p.setPassportNumber(passport.getPassportNumber());
    
    Long personId = passport.getPerson().getId();
    Person person = personRepository.findById(personId).get();
    p.setPerson(person);
    
    // p.setPerson(personRepository.findById(passport.getPerson().getId()).get());

    return passportRepository.save(p);
   }

}
