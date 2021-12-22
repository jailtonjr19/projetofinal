package projeto.cgra.controllers.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cadastroUserController {
    @RequestMapping("/cadastroUser")
    public String cadastroUser(){
        return "cadastro.html";
    }
}
