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

import br.unifacisa.si.loja.domains.Pessoa;
import br.unifacisa.si.loja.service.ServicePessoa;

@RequestMapping("/pessoa")
@RestController
public class ControllerPessoa {

	@Autowired
	public ServicePessoa service;
	
	@GetMapping("/")
	public ResponseEntity<List<Pessoa>> listaPessoa(){
		return new ResponseEntity<List<Pessoa>>(service.getPessoa(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> listaPessoaId(@Valid @PathVariable String id){
		return new ResponseEntity<Pessoa>(service.getPessoaId(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Pessoa> createPessoa(@Valid @RequestBody Pessoa pessoa){
		return new ResponseEntity<Pessoa>(service.postPessoa(pessoa),HttpStatus.CREATED);
	}
	
	@PutMapping("/")
	public ResponseEntity<Pessoa> updatePessoa(@Valid @RequestBody Pessoa pessoa){
		return new ResponseEntity<Pessoa>(service.putPessoa(pessoa),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePessoa(@Valid @PathVariable String id){
		service.deletePessoa(id);
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