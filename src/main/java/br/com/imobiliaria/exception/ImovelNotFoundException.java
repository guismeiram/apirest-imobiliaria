package br.com.imobiliaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ImovelNotFoundException extends Exception{

    public ImovelNotFoundException(Long id) {
        super("Imovel not found with ID " + id);
    }
}
