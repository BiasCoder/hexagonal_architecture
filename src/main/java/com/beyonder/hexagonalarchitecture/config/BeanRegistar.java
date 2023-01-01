package com.beyonder.hexagonalarchitecture.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegistar {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
