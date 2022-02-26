package br.com.imobiliaria.mapper;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.model.Imovel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
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
