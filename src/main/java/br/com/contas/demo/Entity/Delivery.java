package br.com.contas.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer MetodoEntrega;

    private String DeliveryName;

    private Float ValueDelivery;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    public Delivery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMetodoEntrega() {
        return MetodoEntrega;
    }

    public void setMetodoEntrega(Integer metodoEntrega) {
        MetodoEntrega = metodoEntrega;
    }

    public String getDeliveryName() {
        return DeliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        DeliveryName = deliveryName;
    }

    public Float getValueDelivery() {
        return ValueDelivery;
    }

    public void setValueDelivery(Float valueDelivery) {
        ValueDelivery = valueDelivery;
    }

    public Delivery(Long id, Integer metodoEntrega, String deliveryName, Float valueDelivery, Orders order) {
        this.id = id;
        MetodoEntrega = metodoEntrega;
        DeliveryName = deliveryName;
        ValueDelivery = valueDelivery;
        this.order = order;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}
