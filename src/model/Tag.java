package model;

public class Tag {
    private Integer id;
    private String nomeTag;

    public Tag(){}

    public Tag(Integer id, String nomeTag){
        this.id = id;
        this.nomeTag = nomeTag;
    }

    public Integer getId(){
        return id;
    }

    public String getNomeTag(){
        return nomeTag;
    }

    public void setNomeTag(String nomeTag){
        this.nomeTag = nomeTag;
    }
}
