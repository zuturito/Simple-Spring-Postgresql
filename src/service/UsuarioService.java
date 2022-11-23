package com.example.democrud.service;

import com.example.democrud.modelo.Usuario;
import com.example.democrud.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
        @Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario create (Usuario usu) {
		return usuarioRepository.save(usu);
	}
	
	public List<Usuario> getAllPersonas (){
		return usuarioRepository.findAll();
	}
	
	public void delete (Usuario usu) {
		usuarioRepository.delete(usu);
	}
	
	public Optional<Usuario> findById (Long id_usuario) {
		return usuarioRepository.findById(id_usuario);
	}
    
}
