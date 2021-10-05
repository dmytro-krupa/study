package practice.gas_station.service.impl;

import practice.gas_station.entity.Fuel;
import practice.gas_station.entity.Order;
import practice.gas_station.repository.OrderRepository;
import practice.gas_station.service.ManagerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagerServiceImpl implements ManagerService {

    private OrderRepository orderRepository = new OrderRepository();

    @Override
    public String getSoldFuel(final LocalDate localDate) {
        List<Order> orderList = orderRepository.getOrders();

        int result = 0;

        for(Order order : orderList){
            if(order.getLocalDate().equals(localDate)){
                result += order.getAmountOfFuel();
            }
        }

        return "Total sold amount of fuel for " + localDate + " is " + result;
    }

    @Override
    public String getMoneyFromOrders(final LocalDate localDate) {

        List<Order> orderList = orderRepository.getOrders();

        int sum = 0;

        for(Order order : orderList){
            if(order.getLocalDate().equals(localDate)){
                sum += order.getTotalPrice();
            }
        }

        return "Total earning for " + localDate + " is " + sum;
    }

    @Override
    public String getAmountOfFuelInOilTanker(Fuel fuel) {
        return "Total amount of fuel is " + fuel.getAmountOfFuel();
    }

    @Override
    public void makeOrderForMoreFuel(Fuel fuel, int amountOfFuel) {
        fuel.setAmountOfFuel(fuel.getAmountOfFuel() + amountOfFuel);
    }

    @Override
    public String getTopOrder(LocalDate localDate) {
        List<Order> orderList = orderRepository.getOrders();

        List<Order> filteredList = new ArrayList<>();


        for(Order order : orderList){
            if(order.getLocalDate().equals(localDate)){
                filteredList.add(order);
            }
        }

        if(filteredList.isEmpty()){
            return "Orders not found for date : " + localDate;
        }

        Order topOrder = filteredList.get(0);

        for(Order order : filteredList){
            if(order.getTotalPrice() > topOrder.getTotalPrice()){
                topOrder = order;
            }
        }



        return "Top order total price is " + topOrder.getTotalPrice();
    }
}
