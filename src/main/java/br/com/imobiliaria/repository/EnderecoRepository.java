package br.com.imobiliaria.repository;

import br.com.imobiliaria.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer > {
}
