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

@Controller
@RequestMapping("/catalogo")
public class CatalogoController {
	
	@Autowired
	private OperaService operaService;
	
	@GetMapping
	public String getPage(
			Model model,
			@RequestParam(name = "film", required = false) String f,
			@RequestParam(name = "libri", required = false) String l) 
	{
		List<Opera> libri = operaService.getLibri();
		model.addAttribute("libri", libri);
		List<Opera> film = operaService.getFilm();
		model.addAttribute("film", film);
		model.addAttribute("f", f!=null);
		model.addAttribute("l", l!=null);
		return "catalogo";
	}
}
