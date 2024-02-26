package com.example.personapi.infrastructure.dto;

import com.example.personapi.core.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonDTOMapper {

    public PersonDTO toDTO(Person person) {
        return new PersonDTO(person.name(), person.email(), person.document(), person.personType());
    }

    public Person toEntity(PersonDTO dto) {
        return new Person(null, dto.name(), dto.email(), dto.document(), dto.personType());
    }
}
