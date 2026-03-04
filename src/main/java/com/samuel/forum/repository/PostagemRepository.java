package com.samuel.forum.repository;

import com.samuel.forum.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
    //listar por id

}
