package com.example.personapi.core.usecase;

import com.example.personapi.core.entity.Person;
import com.example.personapi.core.gateway.PersonGateway;

import java.util.List;

public class GetAllPersonsUseCaseImpl implements GetAllPersonsUseCase{

    private final PersonGateway personGateway;

    public GetAllPersonsUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public List<Person> execute() {
        return personGateway.getAllPersons();
    }
}
