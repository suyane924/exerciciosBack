package exercicio9.bd.backend.Repository;

import exercicio9.bd.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNomeContaining(String nome);
}
