package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Postagem {
    private Integer id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataCricao;
    private Usuario usuario;
    private ArrayList<Tag> tags;
    private ArrayList<Comentario> comentarios;
    private Integer likes;
    private Integer deslikes;

    public Postagem() {}

    public Postagem(Integer id, String titulo, String conteudo, LocalDateTime dataCricao, Usuario usuario, ArrayList<Tag> tags) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCricao = dataCricao;
        this.usuario = usuario;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataCricao() {
        return dataCricao;
    }

    public void setDataCricao(LocalDateTime dataCricao) {
        this.dataCricao = dataCricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
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
