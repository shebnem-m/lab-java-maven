package org.example;

import com.google.gson.Gson;

public class OrderProcessor{
    public static Order getOrderInfo(){
        String order = """
              {"orderId":132,
              "customer":"Shabnam Muradova",
              "items":[
              {"name":"Latte","price":40.21},
              {"name":"Matcha","price":23.30},
              {"name":"Fanta","price":2.12}
              ]           
              }""";
        return new Gson().fromJson(order, Order.class);

    }
  public static void main(String[] args) {
      Order test = getOrderInfo();
      System.out.println("Order id: "+test.getOrderId());
      System.out.println("Customer: "+test.getCustomer());


  }
}
