package it.corso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.model.Utente;
import it.corso.service.OperaService;
import it.corso.service.UtenteService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/dashboard")
public class AdminController {
	
	@Autowired
	private OperaService operaService;
	@Autowired
	private UtenteService utenteService;
	
	@GetMapping
	public String getPage(Model model, HttpSession session) {
		if (session.getAttribute("admin") == null)
			return "redirect:/utente";
		List<Utente> utenti = utenteService.getUtenti();
		List<Opera> opere =  operaService.getOpere();
		List<Opera> operePrenotate = new ArrayList<>();
		for (Opera o : opere) {
		    if (o.isPrenotato() == true)
			operePrenotate.add(o);
		}
		model.addAttribute("utenti", utenti);
		model.addAttribute("opere", opere);
		model.addAttribute("operePrenotate", operePrenotate);
		return "dashboardAdmin";
	}
	
	@GetMapping("/ripristina")
    public String ripristinaDisponibilità(@RequestParam("id") int id) {

	Opera opera = operaService.findOperaById(id);
	opera.setPrenotato(false);
	operaService.registraOpera(opera);

	return "redirect:/dashboardAdmin";
    }
	
	@PostMapping
	public String controlloAccesso(HttpSession session)
	{
		if (session.getAttribute("admin") == null)
			return "redirect:/utente";
		    return "redirect:/dashboardAdmin";
	}
}
