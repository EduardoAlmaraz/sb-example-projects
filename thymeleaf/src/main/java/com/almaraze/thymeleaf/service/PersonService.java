package com.almaraze.thymeleaf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.almaraze.thymeleaf.domain.Person;
import com.almaraze.thymeleaf.domain.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;
    
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return (List<Person>) this.personRepository.findAll();
    }
}
