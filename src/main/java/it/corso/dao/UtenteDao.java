package it.corso.dao;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Utente;

public interface UtenteDao extends CrudRepository<Utente, Integer>{
	Utente findByUsernameAndPassword(String username, String password);
	Utente findByUsername(String username);
	Utente findByEmail(String email);
}
