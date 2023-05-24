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
@RequestMapping("/libri")
public class LibroController {
	@Autowired
	private OperaService operaService;
	
	@GetMapping
	public String getPage(Model model)
	{
		List<Opera> libri = operaService.getLibri();
		model.addAttribute("libri", libri);
		return "libri";
	}
	
	@GetMapping("elimina")
	public String eliminaOpera(
			@RequestParam("id") int id) {
		operaService.eliminaOpera(operaService.findOperaById(id));
		return "redirect:/libri";
	}
}
