package br.unifacisa.si.loja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.si.loja.domains.Livro;

@Repository
public interface RepositoryLivro extends MongoRepository<Livro , String>{

	
}
