package com.example.personapi.infrastructure.dto;

import com.example.personapi.core.entity.PersonType;

public record PersonDTO(String name,
                        String email,
                        String document,
                        PersonType personType) {
}
