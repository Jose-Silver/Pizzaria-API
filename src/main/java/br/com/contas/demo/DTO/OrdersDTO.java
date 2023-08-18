package br.com.contas.demo.DTO;

import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Entity.Item;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class OrdersDTO {

    private LocalDateTime data;

    private Integer payment;

    private Integer status;

    private String Description;

    private br.com.contas.demo.Entity.Client cliente;
    private List<Item> items;

    public OrdersDTO() {
    }

    public OrdersDTO(LocalDateTime data, Integer payment, Integer status, String description, br.com.contas.demo.Entity.Client cliente, List<Item> items) {

        this.data = data;
        this.payment = payment;
        this.status = status;
        Description = description;
        this.cliente = cliente;
        this.items = items;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
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

    public br.com.contas.demo.Entity.Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

}
