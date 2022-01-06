package projeto.cgra.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.cgra.exception.CpfExistException;
import projeto.cgra.exception.CriptoExistsException;
import projeto.cgra.models.Usuario;
import projeto.cgra.repositories.UsuarioRepository;
import projeto.cgra.util.Util;

@Service
public class ServiceUsuario {
	
	@Autowired
	private UsuarioRepository ur;
	
	public void salvarUsuario(Usuario user) throws Exception {
		
		try {
			if(ur.findByCpf(user.getCpf()) == null) {
				throw new CpfExistException("Já existe um CPF cadastrado" + user.getCpf());
			}
			
			user.setSenha(Util.md5(user.getSenha()));
			
		} catch (NoSuchAlgorithmException e) {
				
			throw new CriptoExistsException("Erro na criptografia da senha");
		
		}
		ur.save(user);
		
	}
	
	public Usuario loginUser(String cpf, String senha) throws ServiceExc{
		
		Usuario userlogin = ur.buscarLogin(cpf, senha);
		return userlogin;
	}
	
}
