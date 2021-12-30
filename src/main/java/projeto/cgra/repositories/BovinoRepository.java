package projeto.cgra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.cgra.models.Bovino;

public interface BovinoRepository extends JpaRepository<Bovino, Long> {

}
