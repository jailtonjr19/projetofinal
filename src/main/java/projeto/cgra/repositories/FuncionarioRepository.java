package projeto.cgra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.cgra.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
