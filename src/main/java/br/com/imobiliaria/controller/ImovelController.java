package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private final ImovelService imovelService;

    public ImovelController(@RequestBody ImovelService imovelService) {
        this.imovelService = imovelService;
    }


    @PostMapping
    @Transactional
    public ResponseEntity<ImovelRespostaDto> salvar(@RequestBody ImovelDto dto){
        Imovel imovel = imovelService.save(dto.converte());
        return new ResponseEntity<>(ImovelRespostaDto.transformaEmDto(imovel), HttpStatus.CREATED);
    }
}
