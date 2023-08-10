package br.com.contas.demo.Entity;

import br.com.contas.demo.Entity.Anotacao;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table ( name="user", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column (name = "nome", nullable = false, unique = true)
    private String nome;

    @Column (name = "idade", nullable = false)
    private Integer idade;

    @JoinColumn (name =" usuario_id")
    @OneToMany
    private List<Anotacao> anotacaoList;

    public Long getId() {
        return id;
    }

    public User() {
    }

    public User(Long id, String nome, Integer idade, List<Anotacao> anotacaoList) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.anotacaoList = anotacaoList;
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
