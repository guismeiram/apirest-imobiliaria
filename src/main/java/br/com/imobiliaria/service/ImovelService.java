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
        Imovel imovelToSave = imovelMapper.toModel(imovelDto);

        Imovel imovelSaved = imovelRepository.save(imovelToSave);
        return createMessageResponse(imovelSaved.getIdImovel(), "Create imovel ID");
    }

    @Override
    public List<MessageResponseDto> listAll() {
        return null;
    }

    @Override
    public ImovelDto findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MessageResponseDto updateById(Long id, ImovelDto personDTO) {
        return null;
    }


    private MessageResponseDto createMessageResponse(Long id, String message) {
        return MessageResponseDto
                .builder()
                .message(message + id)
                .build();
    }
}
