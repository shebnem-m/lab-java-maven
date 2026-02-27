package org.example;

import java.util.List;

public class OrderCalculator {
    public double calculateTotal(Order order) {
        double sum=0;
        List<OrderItem> items=order.getItems();
        for(OrderItem item:items){
            sum+=item.getPrice();
        }
        return sum;
    }
    public void printOrders(Order order){
        double total=calculateTotal(order);
        System.out.println("--- Order Processing Result ---");
        System.out.println("Customer: " + order.getCustomer());
        System.out.println("Items count: " + order.getItems().size());

        System.out.println("Items List:");
        for(OrderItem item: order.getItems()){
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("-------------------------------");
        System.out.println("Calculated Total: " + String.format("%.2f", total));

        if (total > 50) {
            System.out.println("Status: High-value order");
        } else {
            System.out.println("Status: Standard order");
        }

    }
    public static void main(String[] args) {
        Order order = OrderProcessor.getOrderInfo();
        OrderCalculator calculator = new OrderCalculator();
        calculator.printOrders(order);
    }
}

