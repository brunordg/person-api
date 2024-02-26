package com.example.personapi.infrastructure.gateway;

import com.example.personapi.core.entity.Person;
import com.example.personapi.core.gateway.PersonGateway;
import com.example.personapi.infrastructure.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository personRepository;

    private final PersonEntityMapper personEntityMapper;

    @Override
    public Person createPerson(Person person) {
        var personSaved = personRepository.save(personEntityMapper.toEntity(person));

        return personEntityMapper.toPerson(personSaved);
    }

    @Override
    public Person findByDocument(String document) {
        var person = personRepository.findByDocument(document);

        return person == null ? null : personEntityMapper.toPerson(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll().stream()
                .map(personEntityMapper::toPerson)
                .collect(Collectors.toList());
    }
}
