package br.com.imobiliaria.service;

import br.com.imobiliaria.model.Endereco;
import br.com.imobiliaria.repository.EnderecoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EnderecoService {

    final EnderecoRepository _enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this._enderecoRepository = enderecoRepository;
    }

    @Transactional
    public Endereco save(Endereco endereco){
        return _enderecoRepository.save(endereco);
    }

    @Transactional
    public void delete(Endereco endereco){
        _enderecoRepository.save(endereco);
    }

    public Page<Endereco> findAll(Pageable pageable){
        return _enderecoRepository.findAll(pageable);
    }

    public Optional<Endereco> finById(int idEndereco){
        return _enderecoRepository.findById(idEndereco);
    }

    public Endereco atualiza(Endereco endereco){
        return _enderecoRepository.save(endereco);
    }

    public boolean existsByIdEndereco(int idEndereco){
        return _enderecoRepository.existsByIdEndereco(idEndereco);
    }

    public boolean existsByCep(String cep){
        return _enderecoRepository.existsByCep(cep);
    }

    public boolean existsByNImovel(String nImovel){
        return _enderecoRepository.existsByNImovel(nImovel);
    }
}
