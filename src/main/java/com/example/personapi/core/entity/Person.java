package com.example.personapi.core.entity;

public record Person(Long id,
                     String name,
                     String email,
                     String document,
                     PersonType personType) {
}
