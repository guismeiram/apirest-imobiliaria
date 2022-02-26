package br.com.imobiliaria.IService;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;


import java.util.List;

public interface IImovelService {


    public Imovel createImovel(Imovel imovel);


}
