package br.com.imobiliaria.IService;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

public interface IImovelService {


    public Imovel createImovel(Imovel imovel);
    public List<Imovel> getAllImovels();
    public Imovel getImovelById(long id) throws ImovelNotFoundException;
    public void deleteImoveis(long id) throws ImovelNotFoundException;
    public Imovel updateById(Long id, Imovel imovelRequest) throws ImovelNotFoundException;


}
