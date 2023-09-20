package lec3.practice_2023;

/*
система для перевірки кількості товарів на складах та замовлення від постачальників
 
 item
 vendor
 order
 
 company
 warehouse

 пошукати багу чому length масиву == 3, а не 2
 
 */

import com.thoughtworks.qdox.model.expression.Or;

public class OrderSystem {
    public static void main(String[] args) {
        Item bread = new Item("Bread", 20);
        Item milk = new Item("Milk", 45);

        Vendor vendor = new Vendor("ATB", "st. Bandery, 21");

        OrderDetail detail1 = new OrderDetail(bread, 5); //100
        OrderDetail detail2 = new OrderDetail(milk, 3); // 135

        OrderDetail[] orderDetails = {detail1, detail2};




        OrderDetailsContainer container1 = new OrderDetailArray();
        container1.addOrderDetail(detail1);
        container1.addOrderDetail(detail2);

        Order order1 = new Order(vendor, container1);

        //===================================================

        System.out.println(order1.getId());

    }
}
