package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Utente;
import it.corso.service.AdminService;
import it.corso.service.UtenteService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/utente")
public class UtenteController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private UtenteService utenteService;
	
	@GetMapping
	public String getPage(
			@RequestParam(name = "re", required = false) String registrazioneEffettuata,
			@RequestParam(name = "le", required = false) String erroreLogin,
			HttpSession session,
			Model model) {
		model.addAttribute("erroreLogin", erroreLogin != null);
		model.addAttribute("registrazioneEffettuata", registrazioneEffettuata != null);
		if (session.getAttribute("utente") != null)
		    return "redirect:/registrazione"; // dove portiamo l'utente dopo avere loggato
		Utente utente = new Utente();
		model.addAttribute("utente", utente);
		return "registrazione";
	}

	@PostMapping
	public String controllaUtente(
			@RequestParam (name = "username") String username,
			@RequestParam (name = "password") String password,
			HttpSession session, Model model)
	{
		if (adminService.checkAdminLogin(session, username, password))
			return "redirect:/dashboardAdmin";
		
		
		else if(utenteService.controlloLogin(session, username, password))
		    return "redirect:/"; // dove portiamo l'utente dopo avere loggato
		
		else {
			return "redirect:/utente?le";

		}
	}
}