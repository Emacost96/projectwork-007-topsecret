package it.corso.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.model.Prenotazione;
import it.corso.model.Utente;
import it.corso.service.OperaService;
import it.corso.service.PrenotazioneService;
import it.corso.service.UtenteService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/prenota")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    private OperaService operaService;

    @Autowired
    private UtenteService utenteService;

    private Prenotazione prenotazione;
    private Opera opera;

    @GetMapping
    public String getPage(Model model, @RequestParam("id") int id, HttpSession session) {

	opera = operaService.findOperaById(id);
	opera.setPrenotato(true);

	model.addAttribute("opera", opera);
	prenotazione = new Prenotazione();
	prenotazione.setDataOraPrenotazione(LocalDateTime.now());
	prenotazione.setUtente(utenteService.findUtentebyId(((Utente) session.getAttribute("utente")).getId()));
	prenotazione.setOpera(opera);
	model.addAttribute("prenotazione", prenotazione);

	return "confermaprenotazione";
    }

    @GetMapping("/registra")
    public String registraPrenotazione() {

	operaService.registraOpera(opera);
	prenotazioneService.registraPrenotazione(prenotazione);


	return "redirect:/reserved";
    }

    @GetMapping("/ripristina")
    public String ripristinaDisponibilità(@RequestParam("id") int id) {

	Opera opera = operaService.findOperaById(id);
	opera.setPrenotato(false);
	operaService.registraOpera(opera);

	return "redirect:/film";
    }
}
