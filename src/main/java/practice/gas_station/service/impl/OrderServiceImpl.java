package practice.gas_station.service.impl;

import practice.gas_station.entity.Order;
import practice.gas_station.repository.OrderRepository;
import practice.gas_station.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void finishOrder(Order order) {
        OrderRepository orderRepository = new OrderRepository();

        orderRepository.save(order);

    }
}
