package br.com.contas.demo.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "client")

public class Client {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Getter

    private String nome;

    @Getter
    private String phone;
    @Getter
    private  String cpf;
    @ManyToMany
    private List<Adress> adress;

    public Client(String nome, String phone, String cpf) {

    }

    public Client() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Adress> getEndereco() {
        return adress;
    }

    public void setEndereco(List<Adress> adress) {
        this.adress = adress;
    }

    public void addEndereco(Adress adress) {
        this.adress.add(adress);
    }


}
