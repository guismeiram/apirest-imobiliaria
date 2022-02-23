package br.com.imobiliaria.service;

import br.com.imobiliaria.model.Endereco;
import br.com.imobiliaria.model.Telefone;
import br.com.imobiliaria.repository.EnderecoRepository;
import br.com.imobiliaria.repository.TelefoneRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.Optional;

public class TelefoneService {
    final TelefoneRepository _telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository) {
        _telefoneRepository = telefoneRepository;
    }

    @Transactional
    public Telefone save(Telefone telefone){
        return _telefoneRepository.save(telefone);
    }

    @Transactional
    public void delete(Telefone telefone){
        _telefoneRepository.save(telefone);
    }

    public Page<Telefone> findAll(Pageable pageable){
        return _telefoneRepository.findAll(pageable);
    }

    public Optional<Telefone> finById(int idTelefone){
        return _telefoneRepository.findById(idTelefone);
    }

    public Telefone atualiza(Telefone telefone){
        return _telefoneRepository.save(telefone);
    }
}
