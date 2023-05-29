package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.service.OperaService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/dashboard")
public class AdminController {
	
	@Autowired
	private OperaService operaService;
	
	@GetMapping
	public String getPage(Model model, HttpSession session) {
		if (session.getAttribute("admin") == null)
			return "redirect:/utente";
		List<Opera> opere =  operaService.getOpere();
		model.addAttribute("opere", opere);
		return "dashboard";
	}
	
	@GetMapping("/ripristina")
    public String ripristinaDisponibilità(@RequestParam("id") int id) {

	Opera opera = operaService.findOperaById(id);
	opera.setPrenotato(false);
	operaService.registraOpera(opera);

	return "redirect:/admin";
    }
	
	@PostMapping
	public String controlloAccesso(HttpSession session)
	{
		if (session.getAttribute("admin") == null)
			return "redirect:/utente";
		return "riderect:/admin";
	}
}
