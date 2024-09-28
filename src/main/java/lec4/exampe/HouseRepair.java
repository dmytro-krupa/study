package lec4.exampe;

import java.math.BigDecimal;

public class HouseRepair {
    public static final double PRICE_PER_METER = 200;

    public static void main(String[] args) {


        Door door1 = new Door(1);
        Door door2 = new Door(3);
        Door door3 = new Door(7);

        Window[] window1 = {new Window(3.7)};
        Window[] window2 = {new Window(9.83)};
        Window[] window3 = {new Window(7.56)};

        Room room1 = new Room(window1, door1, 6.3, PRICE_PER_METER);
        Room room2 = new Room(window2, door2, 15.3, PRICE_PER_METER);
        Room room3 = new Room(window3, door3, 25.9, PRICE_PER_METER);

        Room[] rooms = {room1, room2, room3};
        House house = new House("home", rooms);


        double totalPrice = 0;


        Calculation[] calculation = new Calculation[4];
        calculation[0] = room1;
        calculation[1] = room2.getDoor();
        calculation[2] = room3.getWindows()[0];
        calculation[3] = room2;

        for(var housePart: calculation){
            totalPrice += housePart.getPrice();
        }







//        for(Room room : rooms){
//            totalPrice += room.getPrice();
//
//            totalPrice += room.getDoor().getPrice();
//
//            for(Window window : room.getWindows()){
//                totalPrice += window.getPrice();
//            }
//        }




        System.out.println("Total price = " + totalPrice);

//====================================

//        System.out.println(a.divide(b, 5));
    }

    /*
        Написати програму, яка реалізовує підрахунок ремонту будинку

        Створити ієрархію

        Написати метод підрахунку ремонту
     */
}
