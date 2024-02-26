package com.example.personapi.core.gateway;

import com.example.personapi.core.entity.Person;

import java.util.List;

public interface PersonGateway {

    Person createPerson(Person person);

    Person findByDocument(String document);

    List<Person> getAllPersons();

}
