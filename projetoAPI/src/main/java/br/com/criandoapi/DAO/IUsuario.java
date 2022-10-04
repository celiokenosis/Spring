package br.com.criandoapi.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

	
}
