package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private Date dataNascimento;
    private ArrayList permissoes;

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario() {}

    public Usuario(String nome, String email, String senha, LocalDateTime dataCadastro, Date dataNascimento, ArrayList permissoes) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.permissoes = permissoes;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(ArrayList permissoes) {
        this.permissoes = permissoes;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", dataNascimento=" + dataNascimento +
                ", permissoes=" + permissoes +
                '}';
    }


}
