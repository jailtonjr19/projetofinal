package projeto.cgra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.cgra.models.Funcionario;
import projeto.cgra.repositories.FuncionarioRepository;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository fr;
	
	@RequestMapping("/cadastrofuncionario/form")
	public String cadastrofunc() {
		return "cadastroFunc/cadastroFunc";
	}
	@PostMapping("/Funcionario")
	public String adicionar (Funcionario funcionario) {
		fr.save(funcionario);
		System.out.println(funcionario);
		return"funcionario-adicionado";
		
	}
	
}
