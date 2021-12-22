package projeto.cgra.controllers.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class loginController {
	@RequestMapping ("/")
	public String login() {
		System.out.println("Controller Login Funcionando");
		return "login.html";
	}
}
