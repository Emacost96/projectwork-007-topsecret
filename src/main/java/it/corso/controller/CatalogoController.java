package it.corso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.corso.model.Opera;
import it.corso.service.OperaService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/catalogo2")
public class CatalogoController {
	
	@Autowired
	private OperaService operaService;
	
	@GetMapping
	public String getPage(
			HttpSession session,
			Model model,
			@RequestParam(name = "film", required = false) String f,
			@RequestParam(name = "libri", required = false) String l,
			@RequestParam(name = "catalogo", required = false) String c) 
	{

	    if (session.getAttribute("utente") != null) {
		model.addAttribute("utente", session);
	    }
	    List<Opera> libri = operaService.getLibri();
	    model.addAttribute("libri", libri);
	    List<Opera> film = operaService.getFilm();
	    model.addAttribute("film", film);
	    model.addAttribute("f", f != null);
	    model.addAttribute("l", l != null);
	    model.addAttribute("c", c != null);
	    return "catalogo2";
	}
}
