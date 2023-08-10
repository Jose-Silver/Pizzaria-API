package br.com.contas.demo.DTO;

import jakarta.persistence.*;


public class AnotacaoDTO {
    private String nome;

    private String anotacao;

    public AnotacaoDTO() {
    }

    public AnotacaoDTO(String nome, String anotacao) {
        this.nome = nome;
        this.anotacao = anotacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
}
