package br.com.imobiliaria.service;

import br.com.imobiliaria.IService.IImovelService;
import br.com.imobiliaria.exception.ImovelNotFoundException;
import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ImovelService implements IImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Imovel createImovel(Imovel imovel) {

        return imovelRepository.save(imovel);

    }

    @Override
    public List<Imovel> getAllImovels() {
        return imovelRepository.findAll();
    }

    @Override
    public Imovel getImovelById(long id) throws ImovelNotFoundException{
        Optional<Imovel> result = imovelRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }else{
            throw new ResourceNotFoundException();
        }
    }

    @Override
    public void deleteImoveis(long id)  throws ImovelNotFoundException{
        Imovel imovel = imovelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        imovelRepository.delete(imovel);
    }

    @Override
    public Imovel updateById(Long id, Imovel imovelRequest) throws ImovelNotFoundException{
        Imovel imovel = imovelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());

        imovel.setStatusImovel(imovelRequest.getStatusImovel());
        imovel.setCodigo(imovelRequest.getCodigo());
        imovel.setTempo_de_uso_imovel(imovelRequest.getTempo_de_uso_imovel());
        imovel.setDataDeAlocacao(imovelRequest.getDataDeAlocacao());
        imovel.setBairro(imovelRequest.getBairro());
        imovel.setCep(imovelRequest.getCep());
        imovel.setCodigo(imovelRequest.getCodigo());
        imovel.setNumero(imovelRequest.getNumero());
        imovel.setRua(imovelRequest.getRua());
        imovel.setNImovel(imovelRequest.getNImovel());
        imovel.setPais(imovelRequest.getPais());

        return imovel;
    }


}
