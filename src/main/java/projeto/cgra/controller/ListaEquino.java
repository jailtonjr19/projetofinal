package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Equino;
import projeto.cgra.repositories.EquinoRepository;

@Controller
public class ListaEquino {

	@Autowired
	private EquinoRepository er;
	
	@RequestMapping("/listaequino")
	public String listaequino() {
		return "cadastroEquino/lista";
	}
	@RequestMapping("/equinolista")
	public ModelAndView listaEquino() {
		ModelAndView mv = new ModelAndView("cadastroEquino/lista");
		Iterable<Equino> equino = er.findAll();
		mv.addObject("Equino", equino);
		return mv;
	}
}
