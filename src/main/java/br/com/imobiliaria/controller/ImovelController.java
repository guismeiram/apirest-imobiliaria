package br.com.imobiliaria.controller;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.service.ImovelService;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Imovel", description = "Imovel controller API")
@RestController
@RequestMapping("/imoveis")
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

    @GetMapping
    public List<ImovelDto> getAllImovels() {

        return imovelService.getAllImovels().stream().map(post -> modelMapper.map(post, ImovelDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImovelDto> getPostById(@PathVariable(name = "id") Long id) throws ImovelNotFoundException{
        Imovel imovel = imovelService.getImovelById(id);

        // convert entity to DTO
        ImovelDto imovelResponse = modelMapper.map(imovel, ImovelDto.class);

        return ResponseEntity.ok().body(imovelResponse);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable(name = "id") Long id) throws ImovelNotFoundException {
        imovelService.deleteImoveis(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity<ImovelDto> updateImovel(@RequestBody ImovelDto imovelDto, @PathVariable long id) throws ImovelNotFoundException {
        Imovel imovelRequest = modelMapper.map(imovelDto, Imovel.class);

        Imovel imovel = imovelService.updateById(id, imovelRequest);

        // convert entity to DTO
        ImovelDto imovelResponse = modelMapper.map(imovel, ImovelDto.class);

        return ResponseEntity.ok().body(imovelResponse);
    }




}
