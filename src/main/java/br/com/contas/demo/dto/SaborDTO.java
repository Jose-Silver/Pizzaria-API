package br.com.contas.demo.dto;

public class SaborDTO {
    private String nome;
    //algumas pizzarias tem sabores que contam com um adicional de preco
    private Float preco_adicional;

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public SaborDTO(String nome, Float preco_adicional, String descricao) {
        this.nome = nome;
        this.preco_adicional = preco_adicional;
        this.descricao = descricao;
    }

    public SaborDTO() {
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco_adicional() {
        return preco_adicional;
    }

    public void setPreco_adicional(Float preco_adicional) {
        this.preco_adicional = preco_adicional;
    }


}
