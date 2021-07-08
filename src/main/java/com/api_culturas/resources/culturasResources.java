package com.api_culturas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_culturas.domain.Culturas;
import com.api_culturas.repository.ICulturasRepository;



@RestController
@RequestMapping ("/culturas")
public class culturasResources {
	//repository tem os métodos CRUD.
	
	@Autowired //injeção de dependência do nosso repository
	private ICulturasRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Culturas>> listCulturas() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	@PostMapping
	public void salvarCulturas(@RequestBody Culturas c) {
			
		repository.save(c);
		
	}
		

}
