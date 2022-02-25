package br.com.imobiliaria.service;

import br.com.imobiliaria.IService.IImovelService;
import br.com.imobiliaria.dto.request.ImovelDto;
import br.com.imobiliaria.dto.response.MessageResponseDto;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImovelService implements IImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    //private final ImovelMapper imovelMapper = ImovelMapper.INSTANCE;
    @Autowired
    private ModelMapper modelMapper;

    /*@Override
    public MessageResponseDto createImovel(ImovelDto imovelDto) {
        return null;
    }*/

    @Override
    public Imovel createImovel(Imovel imovel) {
        //Imovel imovelToSave = imovelMapper.toModel(imovelDto);

        //Imovel imovelToSave = modelMapper.map(imovelDto, imovel);

        //Imovel imovelToSave = toImovelDto(imovelDto);
        //Imovel imovelSaved = imovelRepository.save(imovelToSave);
       //return createMessageResponse(imovelSaved.getIdImovel(), "Create imovel ID");
        //imovelRepository
        return imovelRepository.save(imovel);

    }




   /* @Override
    public List<ImovelDto> listAll() {
        List<Imovel> imovel = imovelRepository.findAll();
        return imovel.stream()
                .map(imovelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ImovelDto findByImovelId(Long id) throws ImovelNotFoundException{
        Imovel imovel = verificaExist(id);
        return imovelMapper.toDTO(imovel);
    }

    @Override
    public void delete(Long id) throws ImovelNotFoundException{
        verificaExist(id);
        imovelRepository.deleteById(id);
    }

    @Override
    public MessageResponseDto updateByImovelId(Long id, ImovelDto imovelDto) throws ImovelNotFoundException {
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

    public ImovelDto toImovelDto(Imovel imovel){
        return modelMapper.map(imovel, ImovelDto.class);
    }*/
}
