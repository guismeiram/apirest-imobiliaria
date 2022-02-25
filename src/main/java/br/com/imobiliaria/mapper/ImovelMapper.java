package br.com.imobiliaria.mapper;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.model.Imovel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImovelMapper {
    ImovelMapper INSTANCE = Mappers.getMapper(ImovelMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Imovel toModel(ImovelDto imovelDto);

    ImovelDto toDTO(Imovel imovel);
}
