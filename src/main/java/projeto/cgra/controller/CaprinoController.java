package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Caprino;
import projeto.cgra.repositories.CaprinoRepository;

@Controller
public class CaprinoController {
	
	@Autowired
	private CaprinoRepository cr;
	
	@RequestMapping("/caprino/form")
	public String caprino() {
		return "cadastroCaprino/formCaprino";
	}
	@PostMapping("/caprino")
	public String adicionar(Caprino caprino) {
		cr.save(caprino);
		System.out.println(caprino);
		return "animal-adicionado";
	}
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
	
	@GetMapping("Caprino/{id}")
	public String deletar(@PathVariable long id) {
		cr.deleteById(id);
		return "redirect:/caprinolista";
	}
}
