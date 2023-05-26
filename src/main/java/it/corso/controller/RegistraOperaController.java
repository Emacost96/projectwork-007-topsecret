package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.model.Opera;
import it.corso.service.OperaService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/registraopera")
public class RegistraOperaController {
	

	@Autowired
	OperaService operaService;
	
	@GetMapping
	public String getPage(Model model, HttpSession session)
	{
	    if (session.getAttribute("admin") == null)
		return "redirect:/utente";
	    
		Opera opera = new Opera();
		model.addAttribute("opera", opera);
		return "registraOpera";

	}
	
	@PostMapping
	public String registraOpera(@ModelAttribute("opera") Opera opera) {

	    operaService.registraOpera(opera);
	    return "redirect:/admin";
	}

}

