package com.example.personapi.core.usecase;

import com.example.personapi.core.entity.Person;
import com.example.personapi.core.exceptions.BusinessException;
import com.example.personapi.core.gateway.PersonGateway;

public class CreatePersonUseCaseImpl implements CreatePersonUseCase {

    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        var personsExist = personGateway.findByDocument(person.document());

        if (personsExist != null) {
            throw new BusinessException("Exists a person into database document: " + person.document());
        }


        return personGateway.createPerson(person);
    }
}
