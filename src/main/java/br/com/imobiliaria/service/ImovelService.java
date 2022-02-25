package br.com.imobiliaria.service;

import br.com.imobiliaria.IService.IImovelService;
import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.mapper.ImovelMapper;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<ImovelDto> listAll() {
        List<Imovel> imovel = imovelRepository.findAll();
        return imovel.stream()
                .map(imovelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ImovelDto findById(Long id) throws ImovelNotFoundException{
        Imovel imovel = verificaExist(id);
        return imovelMapper.toDTO(imovel);
    }

    @Override
    public void delete(Long id) throws ImovelNotFoundException{
        verificaExist(id);
        imovelRepository.deleteById(id);
    }

    @Override
    public MessageResponseDto updateById(Long id, ImovelDto imovelDto) throws ImovelNotFoundException {
        verificaExist(id);
        Imovel imovelUpdate = imovelMapper.toModel(imovelDto);

        Imovel updateImovel = imovelRepository.save(imovelUpdate);
        return createMessageResponse(updateImovel.getIdImovel(), "Updated person with ID ");

    }

    private Imovel verificaExist(long id) throws ImovelNotFoundException{
        return imovelRepository.findById(id)
                .orElseThrow(() -> new ImovelNotFoundException(id));
    }

    private MessageResponseDto createMessageResponse(Long id, String message) {
        return MessageResponseDto
                .builder()
                .message(message + id)
                .build();
    }
}
