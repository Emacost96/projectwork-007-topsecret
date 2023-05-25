package it.corso.service;

import it.corso.model.Admin;
import jakarta.servlet.http.HttpSession;

public interface AdminService {

	 Admin findByUsernameAndPassword(String username, String password);
	 
	 boolean checkAdminLogin (HttpSession session, String username, String password);	
}
