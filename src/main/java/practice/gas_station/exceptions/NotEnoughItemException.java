package practice.gas_station.exceptions;

public class NotEnoughItemException extends RuntimeException {

    public NotEnoughItemException(String message) {
        super(message);
    }
}
