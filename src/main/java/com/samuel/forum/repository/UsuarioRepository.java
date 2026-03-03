package com.samuel.forum.repository;

import com.samuel.forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    //Buscar por e-mail
    //buscar por id
    //buscar por nome
    //salvar ifos
    //deletar usuario por id



}
