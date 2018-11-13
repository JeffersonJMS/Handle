package br.unifacisa.si.loja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.loja.domains.Pessoa;

@Repository
public interface RepositoryPessoa extends MongoRepository<Pessoa, String>{

	
}
