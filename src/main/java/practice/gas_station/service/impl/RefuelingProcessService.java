package practice.gas_station.service.impl;

import practice.gas_station.entity.Client;
import practice.gas_station.entity.Fuel;
import practice.gas_station.entity.Order;
import practice.gas_station.exceptions.NotEnoughItemException;
import practice.gas_station.service.RefuelingProcess;

public class RefuelingProcessService implements RefuelingProcess {
    @Override
    public void refuel(Client client, Fuel fuel, Order order, int needAmountOfFuel) {
        if(fuel.getAmountOfFuel() < needAmountOfFuel){
            throw new NotEnoughItemException("Not enough fuel: " + fuel.getName());
        }

        final int price = fuel.getPrice() * needAmountOfFuel;

        order.setAmountOfFuel(needAmountOfFuel);
        order.setClient(client);
        order.setFuel(fuel);
        order.setTotalPrice(order.getTotalPrice() + price);

        fuel.setAmountOfFuel(fuel.getAmountOfFuel() - needAmountOfFuel);

    }
}
