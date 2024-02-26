package com.example.personapi.infrastructure.persistence;

import com.example.personapi.core.entity.PersonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "PERSON")
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String document;

    @Enumerated(EnumType.STRING)
    private PersonType personType;
}
