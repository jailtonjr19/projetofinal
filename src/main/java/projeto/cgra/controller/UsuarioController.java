package projeto.cgra.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.cgra.models.Usuario;
//import projeto.cgra.repositories.UsuarioRepository;
import projeto.cgra.service.ServiceExc;
import projeto.cgra.service.ServiceUsuario;
//import projeto.cgra.util.Util;

@Controller
public class UsuarioController { 
	
//	@Autowired
//	private UsuarioRepository ur;
	
	@Autowired
	private ServiceUsuario serviceUsuario;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/login")
	public ModelAndView login(){
		ModelAndView mv =  new ModelAndView();
		mv.setViewName("login/login");
		return mv;
	}
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("Usuario", new Usuario());
		mv.setViewName("login/cadastro");
		return mv;
	}
	@PostMapping("salvarUsuario")
	public ModelAndView salvar(Usuario usuario) throws Exception{
		ModelAndView mv = new ModelAndView();
		serviceUsuario.salvarUsuario(usuario);
		System.out.println(usuario);
		mv.setViewName("redirect:/login");
		return mv;
	}
	@PostMapping("/login")
	public ModelAndView Login(@Validated Usuario usuario, BindingResult br, HttpSession session) throws NoSuchAlgorithmException, ServiceExc{
		ModelAndView mv = new ModelAndView();
		mv.addObject("usuario", new Usuario());
		
//		Usuario userLogin = ur.buscarLogin(usuario.getCpf(), Util.md5(usuario.getSenha()));
//		session.setAttribute("usuarioLogado", userLogin);
		return index();
//		if(userLogin == null) {
//			mv.addObject("msg", "Usuário não encontrado. tente novamente");
//		} else {
//		
			
//		}
//	return mv;
	}
	
}