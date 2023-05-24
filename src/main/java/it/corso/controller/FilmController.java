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


//questo genera la lista delle opere
@Controller
@RequestMapping("/film")
public class FilmController {

	@Autowired
	private OperaService operaService;
	
	@GetMapping
	public String getPage(Model model)
	{
		List<Opera> film = operaService.getFilm();
		model.addAttribute("film", film);
		return "film";
	}
	
	
	@GetMapping("elimina")
	public String eliminaOpera(
			@RequestParam("id") int id) {
		operaService.eliminaOpera(operaService.findOperaById(id));
		return "redirect:/film";
	}
}
