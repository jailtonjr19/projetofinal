package projeto.cgra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PrincipalControle {
    
    @RequestMapping("/")
    public String acessarPrincipal(){
        return "home";
    }
}
