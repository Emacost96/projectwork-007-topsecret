package it.corso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.PrenotazioneDao;
import it.corso.dao.UtenteDao;
import it.corso.model.Prenotazione;
import it.corso.model.Utente;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	private PrenotazioneDao prenotazioneDao;
	
	@Autowired
	private UtenteDao utenteDao;

	@Override
	public void registraPrenotazione(Prenotazione prenotazione) {
		prenotazioneDao.save(prenotazione);
	}

	@Override
	public Prenotazione findPrenotazioneById(int id) {
		return prenotazioneDao.findById(id).get();
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		return (List<Prenotazione>) prenotazioneDao.findAll();
	}

	@Override
	public void eliminaPrenotazione(Prenotazione prenotazione) {
		prenotazioneDao.delete(prenotazione);
	}

	@Override
	public List<Prenotazione> getPrenotazioneByIdUtente(int id) {

	    Utente utente = utenteDao.findById(id).get();
	    return utente.getPrenotazioni();
	}

}
