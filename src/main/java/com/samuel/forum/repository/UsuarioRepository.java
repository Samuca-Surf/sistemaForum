package com.samuel.forum.repository;

import com.samuel.forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Buscar por e-mail (para login)
    Optional<Usuario> findByEmail(String email);

    // Verificar se já existe email cadastrado
    boolean existeEsseEmail(String email);

    // Buscar por nome
    List<Usuario> findByNomeContainingIgnoreCase(String nome);

}
