package projeto.cgra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import projeto.cgra.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	@Query("select i from Usuario i where i.cpf = :cpf")
	public List<Usuario> findByCpf(String cpf);
	
	@Query("select j from Usuario j where j.cpf = :cpf and j.senha = :senha")
	public Usuario buscarLogin (String cpf, String senha);
}
