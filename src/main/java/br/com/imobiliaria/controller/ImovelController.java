package br.com.imobiliaria.controller;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.service.ImovelService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/imoveis")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImovelController {

    @Autowired
    private ModelMapper modelMapper;

    private final ImovelService imovelService;

    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ImovelDto> createImovel(@RequestBody ImovelDto imovelDto) {
        // convert DTO to entity
        Imovel imovelRequest = modelMapper.map(imovelDto, Imovel.class);

        Imovel imovel = imovelService.createImovel(imovelRequest);

        // convert entity to DTO
        ImovelDto imovelResponse = modelMapper.map(imovel, ImovelDto.class);

        return new ResponseEntity<ImovelDto>(imovelResponse, HttpStatus.CREATED);
    }



}
