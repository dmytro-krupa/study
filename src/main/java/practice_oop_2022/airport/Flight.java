package practice_oop_2022.airport;

import java.time.LocalDateTime;

//рейс
public class Flight {
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


    private Airport arrivalAirport;
    private Airport departureAirport;

    private Gate arrivalGate;
    private Gate departureGate;
}
