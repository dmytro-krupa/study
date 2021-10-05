package practice.gas_station.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private Fuel fuel;
    private List<Dish> dishes = new ArrayList<>();
    private int amountOfFuel;
    private Client client;
    private LocalDate localDate = LocalDate.now();


    private int totalPrice = 0;

    public Order() {
    }

    public Order(long id, Fuel fuel, int amountOfFuel, Client client, LocalDate localDate, int totalPrice) {
        this.id = id;
        this.fuel = fuel;
        this.amountOfFuel = amountOfFuel;
        this.client = client;
        this.localDate = localDate;
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public void addDish(Dish dish) {
        this.dishes.add(dish);
        this.totalPrice += dish.getPrice();
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", fuel=" + fuel +
                ", amountOfFuel=" + amountOfFuel +
                ", dishes=" + dishes +
                ", client=" + client +
                ", localDate=" + localDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
