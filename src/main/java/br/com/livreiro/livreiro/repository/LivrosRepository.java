package br.com.livreiro.livreiro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.livreiro.livreiro.model.Livros;

public interface LivrosRepository extends CrudRepository<Livros, Long>{
	
	List<Livros> findByEditora(String editora);
	List<Livros> findByTitulo(String titulo);
	
}
