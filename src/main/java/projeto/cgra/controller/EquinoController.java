package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
