package lec6.java_2024.interfaces_2;

public class PushSender implements Sender{
    @Override
    public void send(String s){
        System.out.println("Push notification: + " + s);
    }
}
