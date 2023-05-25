package it.corso.dao;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Admin;
import java.util.List;


public interface AdminDao extends CrudRepository<Admin, Integer>{
	
	Admin findByUsernameAndPassword(String username, String password);

}
