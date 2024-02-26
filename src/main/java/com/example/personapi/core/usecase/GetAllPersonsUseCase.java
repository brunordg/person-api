package com.example.personapi.core.usecase;

import com.example.personapi.core.entity.Person;

import java.util.List;

public interface GetAllPersonsUseCase {

    public List<Person> execute();
}
