package br.com.imobiliaria.IService;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;

import java.util.List;

public interface IImovelService {
    public MessageResponseDto createImovel(ImovelDto imovelDto);
    public List<ImovelDto> listAll();
    public ImovelDto findById(Long id) throws ImovelNotFoundException;
    public void delete(Long id) throws ImovelNotFoundException;
    public MessageResponseDto updateById(Long id, ImovelDto personDTO) throws PersonNotFoundException, ImovelNotFoundException;
}
