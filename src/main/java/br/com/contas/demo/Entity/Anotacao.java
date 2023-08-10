package br.com.contas.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table ( name ="anotacoes", schema = "public")

public class Anotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column (name =" nome", nullable = false, unique = true)
    private String nome;

    public Long getId() {
        return id;
    }

    public Anotacao(Long id, String nome, String anotacao) {
        this.id = id;
        this.nome = nome;
        this.anotacao = anotacao;
    }

    public Anotacao() {
    }

    public void setId(Long id) {
        this.id = id;
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

    @Column ( name = "anotacao")
    private String anotacao;


}
