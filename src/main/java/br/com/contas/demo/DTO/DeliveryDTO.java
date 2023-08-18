package br.com.contas.demo.DTO;

import br.com.contas.demo.Entity.Orders;
import jakarta.persistence.*;


public class DeliveryDTO {

    private Integer MetodoEntrega;

    private String DeliveryName;

    private Float ValueDelivery;


    private Orders order;

    public DeliveryDTO() {
    }

    public DeliveryDTO(Integer metodoEntrega, String deliveryName, Float valueDelivery, Orders order) {
        MetodoEntrega = metodoEntrega;
        DeliveryName = deliveryName;
        ValueDelivery = valueDelivery;
        this.order = order;
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

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
