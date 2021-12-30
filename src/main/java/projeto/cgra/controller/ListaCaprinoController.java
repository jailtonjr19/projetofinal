package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Caprino;
import projeto.cgra.repositories.CaprinoRepository;

@Controller
public class ListaCaprinoController {
	
	@Autowired
	private CaprinoRepository cr;
	
	@RequestMapping("/listacaprino")
	public String listacaprino() {
		return "cadastroCaprino/lista";
	}
	
	@RequestMapping("/caprinolista")
	public ModelAndView listaCaprino() {
		ModelAndView mv = new ModelAndView("cadastroCaprino/lista");
		Iterable<Caprino> caprino = cr.findAll();
		mv.addObject("Caprino", caprino);
		return mv;
	}

}
