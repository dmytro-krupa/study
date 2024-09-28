package lec5.old.lec5_2023;

import java.util.ArrayList;
import java.util.List;

public class ManyToMany {
    static class Passenger{
        List<Ticket> tickets = new ArrayList<>();
    }

    static class Ticket{
        Passenger a;
        B b;
    }

    static class B{
        List<Ticket> tickets = new ArrayList<>();
    }

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();
        B b = new B();

        Ticket ticket1 = new Ticket();
        ticket1.a = passenger1;
        ticket1.b = b;

        Ticket ticket2 = new Ticket();
        ticket2.a = passenger2;
        ticket2.b = b;

        passenger1.tickets.add(ticket1);
        passenger1.tickets.add(ticket2);
        b.tickets.add(ticket1);
        b.tickets.add(ticket2);

    }
}
