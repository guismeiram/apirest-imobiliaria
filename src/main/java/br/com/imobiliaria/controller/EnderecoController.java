package br.com.imobiliaria.controller;

import br.com.imobiliaria.dto.EnderecoDto;
import br.com.imobiliaria.model.Endereco;
import br.com.imobiliaria.service.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/imobiliaria")
public class EnderecoController {

    final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    public ResponseEntity<Object> saveEndereco(@RequestBody EnderecoDto enderecoDto){
        if(enderecoService.existsByCep(enderecoDto.getCep())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Ceps");
        }
        if(enderecoService.existsByNImovel(enderecoDto.getnImovel())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Ceps");
        }

        var endereco = new Endereco();
        //BeanUtil.c
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.save(endereco));
    }


}
