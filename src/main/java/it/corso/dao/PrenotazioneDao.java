package it.corso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.Prenotazione;

public interface PrenotazioneDao extends CrudRepository<Prenotazione, Integer>{

    List<Prenotazione> getPrenotazioniByIdUtente(int id);
}
