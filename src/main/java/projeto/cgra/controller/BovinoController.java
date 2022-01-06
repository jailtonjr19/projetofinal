package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Bovino;
import projeto.cgra.repositories.BovinoRepository;

@Controller
public class BovinoController {
	
	@Autowired
	private BovinoRepository br;
	
	@RequestMapping("/bovino/form")
	public String bovino() {
		return"cadastroBovino/formBovino";
	}
	@PostMapping("/bovino")
	public String adicionar(Bovino bovino) {
		System.out.println(bovino);
		br.save(bovino);
		return "animal-adicionado";
	}
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
	@GetMapping("Bovino/{id}")
	public String deletar(@PathVariable long id) {
		br.deleteById(id);
		return "redirect:/bovinolista";
	}
}
