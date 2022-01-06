package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Equino;
import projeto.cgra.repositories.EquinoRepository;

@Controller
public class EquinoController {
	
	@Autowired
	private EquinoRepository er;
	
	@RequestMapping("/equino/form")
	public String equino() {
		return "cadastroEquino/formEquino";
	}
	@PostMapping("/equino")
	public String adicionar(Equino equino) {
		er.save(equino);
		System.out.println(equino);
		return "animal-adicionado";
	}
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
	@GetMapping("Equino/{id}")
	public String deletar(@PathVariable long id) {
		er.deleteById(id);
		return "redirect:/equinolista";
	}
}
