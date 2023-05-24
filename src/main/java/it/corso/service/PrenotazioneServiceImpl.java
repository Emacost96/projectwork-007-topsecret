package it.corso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.PrenotazioneDao;
import it.corso.model.Prenotazione;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	private PrenotazioneDao prenotazioneDao;
	
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
	    List<Prenotazione> prenotazioniUtente = new ArrayList<>();
	    List<Prenotazione> prenotazioni = (List<Prenotazione>) prenotazioneDao.findAll();

	    for (Prenotazione p : prenotazioni) {
		if (p.getUtente().getId() == id) {
		    prenotazioniUtente.add(p);
		}
	    }
	    return prenotazioniUtente;
	}

}
