package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
