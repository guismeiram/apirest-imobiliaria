package br.com.imobiliaria.service;

import br.com.imobiliaria.model.Usuario;
import br.com.imobiliaria.repository.UsuarioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.Optional;

public class UsuarioService {
    final UsuarioRepository _usuarioRepository;



    public UsuarioService(UsuarioRepository usuarioRepository) {
        _usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario save(Usuario usuario){
        return _usuarioRepository.save(usuario);
    }

    @Transactional
    public void delete(Usuario usuario){
        _usuarioRepository.save(usuario);
    }

    public Page<Usuario> findAll(Pageable pageable){
        return _usuarioRepository.findAll(pageable);
    }

    public Optional<Usuario> finById(int idUsuario){
        return _usuarioRepository.findById(idUsuario);
    }

    public Usuario atualiza(Usuario usuario){
        return _usuarioRepository.save(usuario);
    }
}
