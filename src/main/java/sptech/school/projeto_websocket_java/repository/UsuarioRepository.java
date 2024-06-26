package sptech.school.projeto_websocket_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.projeto_websocket_java.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
