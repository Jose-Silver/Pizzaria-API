package br.com.contas.demo.DTO;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class ReportDTO {
    private LocalDateTime data;
    private Integer CanceledOrders;

    private Integer OrdersDelivered;

    private Integer WithdrawnOrders;

    private Float TotalVillingCard;

    private Float TotalBillingMoney;

    public ReportDTO() {
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getCanceledOrders() {
        return CanceledOrders;
    }

    public void setCanceledOrders(Integer canceledOrders) {
        CanceledOrders = canceledOrders;
    }

    public Integer getOrdersDelivered() {
        return OrdersDelivered;
    }

    public void setOrdersDelivered(Integer ordersDelivered) {
        OrdersDelivered = ordersDelivered;
    }

    public Integer getWithdrawnOrders() {
        return WithdrawnOrders;
    }

    public void setWithdrawnOrders(Integer withdrawnOrders) {
        WithdrawnOrders = withdrawnOrders;
    }

    public Float getTotalVillingCard() {
        return TotalVillingCard;
    }

    public void setTotalVillingCard(Float totalVillingCard) {
        TotalVillingCard = totalVillingCard;
    }

    public Float getTotalBillingMoney() {
        return TotalBillingMoney;
    }

    public void setTotalBillingMoney(Float totalBillingMoney) {
        TotalBillingMoney = totalBillingMoney;
    }

    public ReportDTO( LocalDateTime data, Integer canceledOrders, Integer ordersDelivered, Integer withdrawnOrders, Float totalVillingCard, Float totalBillingMoney) {

        this.data = data;
        CanceledOrders = canceledOrders;
        OrdersDelivered = ordersDelivered;
        WithdrawnOrders = withdrawnOrders;
        TotalVillingCard = totalVillingCard;
        TotalBillingMoney = totalBillingMoney;
    }
}
