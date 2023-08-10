package br.com.contas.demo.DTO;

import br.com.contas.demo.Entity.Anotacao;
import jakarta.persistence.*;

import java.util.List;

public class UserDTO {

    private String nome;

    private Integer idade;

    private List<Anotacao> anotacaoList;


    public UserDTO() {
    }

    public UserDTO( String nome, Integer idade, List<Anotacao> anotacaoList) {
        this.nome = nome;
        this.idade = idade;
        this.anotacaoList = anotacaoList;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Anotacao> getAnotacaoList() {
        return anotacaoList;
    }

    public void setAnotacaoList(List<Anotacao> anotacaoList) {
        this.anotacaoList = anotacaoList;
    }




}
