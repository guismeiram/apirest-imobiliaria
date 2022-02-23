package br.com.imobiliaria.service;

import br.com.imobiliaria.model.Imovel;
import br.com.imobiliaria.repository.ImovelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.Optional;

public class ImovelService {
    final ImovelRepository _imovelRepository;

    public ImovelService(ImovelRepository imovelRepository) {
        _imovelRepository = imovelRepository;
    }

    @Transactional
    public Imovel save(Imovel imovel){
        return _imovelRepository.save(imovel);
    }

    @Transactional
    public void delete(Imovel imovel){
        _imovelRepository.save(imovel);
    }

    public Page<Imovel> findAll(Pageable pageable){
        return _imovelRepository.findAll(pageable);
    }

    public Optional<Imovel> finById(int idImovel){
        return _imovelRepository.findById(idImovel);
    }

    public Imovel atualiza(Imovel imovel){
        return _imovelRepository.save(imovel);
    }
}
