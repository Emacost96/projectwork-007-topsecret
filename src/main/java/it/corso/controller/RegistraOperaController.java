package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.service.OperaService;

@Controller
@RequestMapping("/registraOpera")
public class RegistraOperaController {
	
	@Autowired
	OperaService operaService;
	
	@GetMapping
	public String getPage(Model model)
	{
		Opera opera = new Opera();
		model.addAttribute("opera", opera);
		return "registraOpera";
	}
	
	@PostMapping
	public String registraOpera(@ModelAttribute("opera") Opera opera) {
		operaService.registraOpera(opera);
		return "redirect:/opere";
	}
}
