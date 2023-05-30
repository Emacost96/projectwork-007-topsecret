package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Prenotazione;
import it.corso.model.Utente;
import it.corso.service.PrenotazioneService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/dashboardutente")
public class ReservedController {


	
	@Autowired
	PrenotazioneService prenotazioneService;
	
	@GetMapping
	public String getPage(HttpSession session, Model model) {

		if(session.getAttribute("utente") == null)
			return "redirect:/utente";
	    Utente utente = (Utente) session.getAttribute("utente");
	    model.addAttribute("utente", utente);

	    List<Prenotazione> prenotazioni = prenotazioneService.getPrenotazioneByIdUtente(utente.getId());
	    model.addAttribute("prenotazioni", prenotazioni);

		return "dashboardUtente";
	}
	
	
	

}
