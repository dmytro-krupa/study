package practice.gas_station;

import practice.gas_station.entity.*;
import practice.gas_station.repository.OrderRepository;
import practice.gas_station.service.ManagerService;
import practice.gas_station.service.OrderService;
import practice.gas_station.service.RefuelingProcess;
import practice.gas_station.service.impl.ManagerServiceImpl;
import practice.gas_station.service.impl.OrderServiceImpl;
import practice.gas_station.service.impl.RefuelingProcessService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fuel fuel = new Fuel();

        fuel.setName("95");
        fuel.setAmountOfFuel(1000);
        fuel.setPrice(30);

        RefuelingProcess refuelingProcess = new RefuelingProcessService();
        OrderService orderService = new OrderServiceImpl();
        OrderRepository orderRepository = new OrderRepository();

        Order orderDanil = new Order();
        Client danil = new Client(1L, "Danil", "Ivanilov");

        Order ivankasOrder = new Order();
        Client ivanka = new Client(2L, "Ivanka", "Maksymiv");



        Order volodymyrOrder = new Order();
        Client volodymyr = new Client(3L, "Volodymyr", "Gural");

        refuelingProcess.refuel(danil, fuel, orderDanil, 15);
        orderService.finishOrder(orderDanil);

        refuelingProcess.refuel(volodymyr, fuel, volodymyrOrder, 30);
        orderService.finishOrder(volodymyrOrder);


        refuelingProcess.refuel(ivanka, fuel, ivankasOrder, 20);
        orderService.finishOrder(ivankasOrder);

        final ManagerService managerService = new ManagerServiceImpl();

//        System.out.println(managerService.getSoldFuel(LocalDate.now()));
//        System.out.println(managerService.getMoneyFromOrders(LocalDate.now()));
//        System.out.println(managerService.getAmountOfFuelInOilTanker(fuel));


        Dish hotdog = new Dish("hotdog", 33, 250);
        Dish blackCoffee = new Dish("black coffee", 15, 250);
        Dish blackCoffeeWithMilk = new Dish("black coffee with milk", 22, 300);

        final Menu menu = new Menu();

        menu.getDishes().add(hotdog);
        menu.getDishes().add(blackCoffee);
        menu.getDishes().add(blackCoffeeWithMilk);


        ivankasOrder.addDish(hotdog);
        ivankasOrder.addDish(blackCoffee);



        System.out.println(ivankasOrder);
        System.out.println(volodymyrOrder);
        System.out.println(orderDanil);

        System.out.println();
        System.out.println();

        System.out.println(managerService.getTopOrder(LocalDate.now().minusDays(1)));

    }
}

