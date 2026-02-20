package sistema_ellos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema_ellos.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
