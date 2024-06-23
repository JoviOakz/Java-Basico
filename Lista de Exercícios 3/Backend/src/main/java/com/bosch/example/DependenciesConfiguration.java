package com.bosch.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bosch.example.impl.DatabaseCities;
import com.bosch.example.impl.DatabaseCreateUser;
import com.bosch.example.impl.DefaultCwbRegister;
import com.bosch.example.services.CitiesService;
import com.bosch.example.services.CreateUserService;
import com.bosch.example.services.CwbRegisterService;

@Configuration
public class DependenciesConfiguration {
    @Bean
    @Scope("singleton")
    public CwbRegisterService cwbRegister() {
        return new DefaultCwbRegister();
    }

    @Bean
    @Scope("singleton")
    public CitiesService citiesService() {
        return new DatabaseCities();
    }

    @Bean
    @Scope("singleton")
    public CreateUserService createUserService() {
        return new DatabaseCreateUser();
    }
}