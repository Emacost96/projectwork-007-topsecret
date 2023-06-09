package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.service.DettaglioService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/dettaglio")
public class DettaglioController {

	@Autowired
	private DettaglioService dettaglioService;
	
	@GetMapping
	public String getPage(
			Model model,
		@RequestParam("id") int id, HttpSession session) {
	    if (session.getAttribute("utente") != null) {
		model.addAttribute("utente", session);
	    }
	    	
    		Opera opera = dettaglioService.findOperaById(id);
		model.addAttribute("opera", opera);
		if(opera.getCast() != null) 
			model.addAttribute("cast", opera.getCast().split(","));
		return "dettaglio";
	}
}
