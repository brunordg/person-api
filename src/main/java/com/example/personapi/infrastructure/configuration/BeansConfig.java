package com.example.personapi.infrastructure.configuration;

import com.example.personapi.core.gateway.PersonGateway;
import com.example.personapi.core.usecase.CreatePersonUseCase;
import com.example.personapi.core.usecase.CreatePersonUseCaseImpl;
import com.example.personapi.core.usecase.GetAllPersonsUseCase;
import com.example.personapi.core.usecase.GetAllPersonsUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway) {
        return new CreatePersonUseCaseImpl(personGateway);
    }

    @Bean
    public GetAllPersonsUseCase getAllPersonsUseCase(PersonGateway personGateway) {
        return new GetAllPersonsUseCaseImpl(personGateway);
    }
}
