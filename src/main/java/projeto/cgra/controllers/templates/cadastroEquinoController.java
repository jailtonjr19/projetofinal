package projeto.cgra.controllers.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroEquinoController {
    @RequestMapping ("/cadastroEquino")
    public String cadastroEquino(){
        return "cadastroEquino.html";
    }
}
