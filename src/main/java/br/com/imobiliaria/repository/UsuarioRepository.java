package br.com.imobiliaria.repository;

import br.com.imobiliaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer > {
}
