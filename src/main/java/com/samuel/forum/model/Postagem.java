package com.samuel.forum.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPostagem;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String titulo;
    private String conteudo;

    private LocalDateTime dataCriacao;

    @ManyToMany
    @JoinTable(
            name = "postagem_tag",
            joinColumns = @JoinColumn(name = "postagem_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;
    private Integer likes = 0;
    private Integer deslikes = 0;

    public Postagem(){}

    public Postagem(Integer idPostagem, Usuario usuario, String titulo, String conteudo, LocalDateTime dataCriacao, List<Tag> tags) {
        this.idPostagem = idPostagem;
        this.usuario = usuario;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = dataCriacao;
        this.tags = tags;
    }

    public Integer getIdPostagem(){
        return idPostagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo(){
        return  titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDeslikes() {
        return deslikes;
    }

    public void setDeslikes(Integer deslikes) {
        this.deslikes = deslikes;
    }
}
