package practice.gas_station.repository;

import practice.gas_station.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static List<Order> orders = new ArrayList<>();

    public void save(Order order){
        orders.add(order);
    }

    public List<Order> getOrders(){
        return orders;
    }


}
