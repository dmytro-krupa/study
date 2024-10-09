package lec6.java_2024.interfaces_2;

public class EmailSender implements Sender {
    @Override
    public void send(String body){
        System.out.println("Email: + " + body);
    }
}
