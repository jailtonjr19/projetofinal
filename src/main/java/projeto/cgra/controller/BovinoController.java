package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
