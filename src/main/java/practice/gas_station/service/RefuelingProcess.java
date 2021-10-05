package practice.gas_station.service;

import practice.gas_station.entity.Client;
import practice.gas_station.entity.Fuel;
import practice.gas_station.entity.Order;

public interface RefuelingProcess {
    void refuel(Client client, Fuel fuel, Order order, int needAmountOfFuel);
}
