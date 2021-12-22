package projeto.cgra.controllers.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroCaprinoController {
	@RequestMapping("/cadastroCaprino")
	public String cadastroCaprino(){
		return "cadastroCaprino.html";
	}

}
