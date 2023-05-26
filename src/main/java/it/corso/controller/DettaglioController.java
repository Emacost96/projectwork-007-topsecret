package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.service.DettaglioService;

@Controller
@RequestMapping("/dettaglio")
public class DettaglioController {

	@Autowired
	private DettaglioService dettaglioService;
	
	@GetMapping
	public String getPage(
			Model model,
			@RequestParam("id") int id) {
		Opera opera = dettaglioService.findOperaById(id);
		model.addAttribute("opera", opera);
		return "dettaglio";
	}
}
