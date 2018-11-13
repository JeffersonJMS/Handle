package br.unifacisa.si.loja.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.loja.domains.Livro;
import br.unifacisa.si.loja.repository.RepositoryLivro;

@Service
public class ServiceLivro {

	@Autowired
	RepositoryLivro repository;
	
	public List<Livro> getLivro(){
		return repository.findAll();
	}
	
	public Livro getLivroId(String id){
		return repository.findById(id).get();
	}
	
	public Livro postLivro(Livro livro){
		return repository.insert(livro);
	}
	
	public Livro putLivro(Livro livro){
		return repository.save(livro);
	}
	public void deleteLivro(String id){
		repository.deleteById(id);
	}
	/*
	public HttpStatus deleteAll() {
		repository.deleteAll();
		return HttpStatus.OK;
	}
	*/
}
