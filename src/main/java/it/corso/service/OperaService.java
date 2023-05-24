package it.corso.service;

import java.util.List;

import it.corso.model.Opera;

public interface OperaService {
	void registraOpera(Opera opera);
	Opera findOperaById(int id);
	List<Opera> getFilm();
	List<Opera> getLibri();
	void eliminaOpera(Opera opera);
	
}
