package lec6.java_2024.interfaces_2;

public class SMSSender implements Sender {
    @Override
    public void send(String sms) {
        System.out.println("SMS: + " + sms);
    }
}
