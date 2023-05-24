package it.corso.service;

import java.util.List;

import it.corso.model.Prenotazione;

public interface PrenotazioneService {
	void registraPrenotazione(Prenotazione prenotazione);
	Prenotazione findPrenotazioneById(int id);
	List<Prenotazione> getPrenotazioni();
	void eliminaPrenotazione(Prenotazione prenotazione);
}
