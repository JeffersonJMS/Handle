package br.unifacisa.si.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.si.loja.domains.Pessoa;
import br.unifacisa.si.loja.repository.RepositoryPessoa;

@Service
public class ServicePessoa {
	
	@Autowired
	public RepositoryPessoa repository;
	
	public List<Pessoa> getPessoa(){
		return (repository.findAll());
	}
	
	public Pessoa getPessoaId(String id){
		return repository.findById(id).get();
	}
	
	public Pessoa postPessoa(Pessoa pessoa){
		return repository.insert(pessoa);
	}
	
	public Pessoa putPessoa(Pessoa pessoa){
		return repository.save(pessoa);
	}
	
	public void deletePessoa(String id){
		repository.deleteById(id);
	}
	
	/*
	public void deleteAll() {
		repository.deleteAll();
	}
	*/
}
