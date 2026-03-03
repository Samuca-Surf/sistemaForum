package com.samuel.forum.model;

import jakarta.persistence.*;import java.util.List;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeTag;

    @OneToMany(mappedBy = "tags")
    private List<Postagem> postagens;

    public Tag(){}

    public Tag(Integer id, String nomeTag){
        this.id = id;
        this.nomeTag = nomeTag;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeTag() {
        return nomeTag;
    }

    public void setNomeTag(String nomeTag) {
        this.nomeTag = nomeTag;
    }

}
