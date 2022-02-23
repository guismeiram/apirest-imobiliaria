package br.com.imobiliaria.repository;

import br.com.imobiliaria.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Integer > {
}
