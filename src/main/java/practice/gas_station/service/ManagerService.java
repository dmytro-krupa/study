package practice.gas_station.service;

import practice.gas_station.entity.Fuel;

import java.time.LocalDate;

public interface ManagerService {
    String getSoldFuel(LocalDate localDate);
    String getMoneyFromOrders(LocalDate localDate);
    String getAmountOfFuelInOilTanker(Fuel fuel);
    void makeOrderForMoreFuel(Fuel fuel, int amountOfFuel);
    String getTopOrder(LocalDate localDate);

}
