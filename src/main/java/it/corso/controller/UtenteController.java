package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Utente;
import it.corso.service.UtenteService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/utente")
public class UtenteController {
	
	@Autowired
	private UtenteService utenteService;
	
	@GetMapping
	public String getPage(
			HttpSession session,
			Model model) {
		if (session.getAttribute("utente") != null)
			return "redirect:/reserved"; // dove portiamo l'utente dopo avere loggato
		Utente utente = new Utente();
		model.addAttribute("utente", utente);
		return "login";
	}
	
	@PostMapping
	public String controllaUtente(
			@RequestParam (name = "username") String username,
			@RequestParam (name = "password") String password,
			HttpSession session)
	{
		if (!utenteService.controlloLogin(session, username, password))
			return "redirect:/utente?le";
		return "reserved"; // dove portiamo l'utente dopo avere loggato
	}
	
}