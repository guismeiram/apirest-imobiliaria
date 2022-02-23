package br.com.imobiliaria.repository;

import br.com.imobiliaria.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer > {
}
