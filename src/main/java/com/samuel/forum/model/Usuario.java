package com.samuel.forum.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;
    private String nome;
    private String senha;
    private Double telefone;
    private Date dataNascimento;
    private LocalDateTime dataCadastro;
    private ArrayList permissoes;

    public Usuario() {}

    public Usuario(Integer id, String email, String senha, String nome, Double telefone, Date dataNascimento, LocalDateTime dataCadastro, ArrayList permissoes) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.permissoes = permissoes;
    }

    public Integer getId(){
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTelefone() {
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public LocalDateTime getDataCadastro(){
        return dataCadastro;
    }



    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
