package br.com.contas.demo.Entity;

import jakarta.persistence.*;
import org.hibernate.usertype.StaticUserTypeSupport;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime data;
    @Enumerated(EnumType.STRING)
    private Payment payment;

    private Status status;

    private String Description;

    @ManyToOne
    @JoinColumn(name = "ClientID")
    private Client cliente;
    @ManyToMany
    private List<Item> items;

    public Orders() {
    }

    public Orders(Long id, LocalDateTime data, Payment payment, Integer status, String description, Client cliente, List<Item> items) {
        this.id = id;
        this.data = data;
        this.payment = payment;
        this.status = status;
        Description = description;
        this.cliente = cliente;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Enum<Payment> getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

}
