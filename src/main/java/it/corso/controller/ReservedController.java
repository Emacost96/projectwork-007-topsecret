package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.service.PrenotazioneService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/reserved")
public class ReservedController {
	
	@Autowired
	PrenotazioneService prenotazioneService;
	
	@GetMapping
	public String getPage(HttpSession session) {
		return "reserved";
	}
	
	
	
	/* prenotazione singola 
	   ogni opera ha il suo dettaglio
	   nel dettaglio pulsante prenota
	   setPrenotato(), all'interno ci mettiamo i dati dell'utente
	   */
}
