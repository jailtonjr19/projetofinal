package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Bovino;
import projeto.cgra.repositories.BovinoRepository;

@Controller
public class ListaBovinoController {

	@Autowired
	private BovinoRepository br;
	
	@RequestMapping("/listabovino")
	public String listabovino() {
		return "cadastroBovino/lista";
	}
	@RequestMapping("/bovinolista")
	public ModelAndView listaBovino() {
		ModelAndView mv = new ModelAndView("cadastroBovino/lista");
		Iterable<Bovino> bovino = br.findAll();
		mv.addObject("Bovino", bovino);
		return mv;
	}
}
