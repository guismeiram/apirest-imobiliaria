package br.com.imobiliaria.IService;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;


import java.util.List;

public interface IImovelService {
    //public MessageResponseDto createImovel(ImovelDto imovelDto);

    public Imovel createImovel(Imovel imovel);

    /*public List<ImovelDto> listAll();
    public ImovelDto findByImovelId(Long id) throws ImovelNotFoundException;
    public void delete(Long id) throws ImovelNotFoundException;
    public MessageResponseDto updateByImovelId(Long id, ImovelDto personDTO) throws ImovelNotFoundException;*/
}
