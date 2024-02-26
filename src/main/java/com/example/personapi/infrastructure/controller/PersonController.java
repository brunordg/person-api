package com.example.personapi.infrastructure.controller;

import com.example.personapi.core.usecase.CreatePersonUseCase;
import com.example.personapi.core.usecase.GetAllPersonsUseCase;
import com.example.personapi.infrastructure.dto.PersonDTO;
import com.example.personapi.infrastructure.dto.PersonDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/person")
public class PersonController {

    private final CreatePersonUseCase createPersonUseCase;

    private final GetAllPersonsUseCase getAllPersonsUseCase;

    private final PersonDTOMapper personDTOMapper;

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO) {

        var pessoa = createPersonUseCase.execute(personDTOMapper.toEntity(personDTO));

        return personDTOMapper.toDTO(pessoa);
    }

    @GetMapping
    public List<PersonDTO> getAll() {
        return getAllPersonsUseCase.execute()
                .stream()
                .map(personDTOMapper::toDTO)
                .collect(Collectors.toList());
    }

}
