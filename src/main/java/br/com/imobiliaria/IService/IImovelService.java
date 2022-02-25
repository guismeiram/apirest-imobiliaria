package br.com.imobiliaria.IService;

import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;

import java.util.List;

public interface IImovelService {
    public MessageResponseDto createImovel(ImovelDto imovelDto);
    public List<MessageResponseDto> listAll();
    public ImovelDto findById(int id);
    public void delete(Long id);
    public MessageResponseDto updateById(Long id, ImovelDto personDTO);
}
