package koda.dev.br.finance.repository;

import koda.dev.br.finance.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}