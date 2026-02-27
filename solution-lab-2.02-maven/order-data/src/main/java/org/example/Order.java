package org.example;

import java.util.List;

public class Order {
    private int orderId;
    private String customer;
    private List<OrderItem> items;
    private double total;
    public Order(int orderId, String customer,List<OrderItem> items,double total){
        this.orderId=orderId;
        this.customer=customer;
        this.items=items;
        this.total=total;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
