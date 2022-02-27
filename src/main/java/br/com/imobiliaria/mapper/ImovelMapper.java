package br.com.imobiliaria.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImovelMapper {


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }



}
