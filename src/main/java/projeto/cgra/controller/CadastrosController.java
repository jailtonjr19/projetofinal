package projeto.cgra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastrosController {
	@RequestMapping("/cadastros")
	public String cadastros() {
		return "cadastro.html";	
	}
	

}
