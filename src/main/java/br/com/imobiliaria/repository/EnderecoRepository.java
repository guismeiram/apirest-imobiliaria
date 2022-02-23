package br.com.imobiliaria.repository;

import br.com.imobiliaria.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer > {
    boolean existsByCep(String cep);
    boolean existsByNImovel(String nImovel);

}
