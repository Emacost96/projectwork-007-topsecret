package it.corso.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.OperaDao;
import it.corso.model.Opera;

@Service
public class OperaServiceImpl implements OperaService {
	
	@Autowired
	private OperaDao operaDao;
	
	@Override
	public void registraOpera(Opera opera) {


		if(opera.getTipologia().equals("F")) 
		{
			opera.setEditore(null);
			opera.setIsbn(null);
		}
		else {
			opera.setRegista(null);
			opera.setCast(null);
		}


		if (opera.getFileImmagine() != null && !opera.getFileImmagine().isEmpty()) {
		    try {
			String contentType = opera.getFileImmagine().getContentType();

			opera.setImmagine(
				"data:" + contentType + ";base64,"
					+ Base64.getEncoder().encodeToString(opera.getFileImmagine().getBytes()));
		    } catch (IOException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		    }
		}

		operaDao.save(opera);
	}

	@Override
	public Opera findOperaById(int id) {
		return operaDao.findById(id).get();
	}

	@Override
	public void eliminaOpera(Opera opera) {
		operaDao.delete(opera);

	}

	@Override
	public List<Opera> getFilm() {
		List<Opera> opere = (List<Opera>) operaDao.findAll();
		List<Opera> film = new ArrayList<>();
		for (Opera o : opere)
		{
			if(o.getTipologia().equals("F")) {
				film.add(o);
			}
		}
		return film;
	}

	@Override
	public List<Opera> getLibri() {
		List<Opera> opere = (List<Opera>) operaDao.findAll();
		List<Opera> libri = new ArrayList<>();
		for (Opera o : opere)
		{
			if(o.getTipologia().equals("L")) {
				libri.add(o);
			}
		}
		return libri;
	}

	@Override
	public List<Opera> getOpere() {
		
		return (List<Opera>) operaDao.findAll();
	}

}
