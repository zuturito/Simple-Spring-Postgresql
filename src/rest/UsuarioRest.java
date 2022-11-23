package com.example.democrud.rest;

import com.example.democrud.modelo.Usuario;
import com.example.democrud.service.UsuarioService;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/usuarios/")
public class UsuarioRest {
    @Autowired 
	private UsuarioService personaService;
	
	@PostMapping
	private ResponseEntity<Usuario> guardar(@RequestBody Usuario usu){
		Usuario temporal = personaService.create(usu);
		try {
			return ResponseEntity.created(new URI("/api/usuarios"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping 
	private ResponseEntity<List<Usuario>> listarTodasLasPersona (){
		return ResponseEntity.ok(personaService.getAllPersonas());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarPersona(@RequestBody Usuario persona){
		personaService.delete(persona);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Usuario>> listarPersonasPorID(@PathVariable ("id_usuario") Long id){
		return ResponseEntity.ok(personaService.findById(id));
	}
}
