package practice.gas_station.entity;

import study.A;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public Menu() {
    }

    public Menu(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return dishes.toString();
    }
}
