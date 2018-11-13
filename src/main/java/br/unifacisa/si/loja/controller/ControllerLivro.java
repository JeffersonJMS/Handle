package br.unifacisa.si.loja.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.si.loja.domains.Livro;
import br.unifacisa.si.loja.service.ServiceLivro;

@RequestMapping("/livro")
@RestController
public class ControllerLivro {
	
	@Autowired
	ServiceLivro service;
	
	@GetMapping("/")
	public ResponseEntity<List<Livro>> listaLivro() {
		return new ResponseEntity<List<Livro>>(service.getLivro(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> listaLivroId(@Valid @PathVariable String id){
		return new ResponseEntity<Livro>(service.getLivroId(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Livro> createLivro(@Valid @RequestBody Livro livro){
		return new ResponseEntity<Livro>(service.postLivro(livro),HttpStatus.CREATED);
	}
	
	@PutMapping("/")
	public ResponseEntity<Livro> updateLivro(@Valid @RequestBody Livro livro){
		return new ResponseEntity<Livro>(service.putLivro(livro),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteLivroId(@Valid @PathVariable String id){
		service.deleteLivro(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	/*
	@DeleteMapping("/")
	public ResponseEntity<String> deleteAll(){
		service.deleteAll();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	*/	
}