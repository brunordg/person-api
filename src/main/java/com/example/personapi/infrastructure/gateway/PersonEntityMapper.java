package com.example.personapi.infrastructure.gateway;

import com.example.personapi.core.entity.Person;
import com.example.personapi.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonEntityMapper {

    public PersonEntity toEntity(Person person) {
        return new PersonEntity(person.id(), person.name(), person.email(), person.document(), person.personType());
    }

    public Person toPerson(PersonEntity entity) {
        return new Person(entity.getId(), entity.getName(), entity.getEmail(), entity.getDocument(), entity.getPersonType());

    }
}
