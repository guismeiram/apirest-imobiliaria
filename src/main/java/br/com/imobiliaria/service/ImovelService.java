package br.com.imobiliaria.service;

import br.com.imobiliaria.IService.IImovelService;
import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.mapper.ImovelMapper;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImovelService implements IImovelService {
    private ImovelRepository imovelRepository;

    private final ImovelMapper imovelMapper = ImovelMapper.INSTANCE;


    @Override
    public MessageResponseDto createImovel(ImovelDto imovelDto) {
        return null;
    }

    @Override
    public List<MessageResponseDto> listAll() {
        return null;
    }

    @Override
    public ImovelDto findById(int id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MessageResponseDto updateById(Long id, ImovelDto personDTO) {
        return null;
    }
}
