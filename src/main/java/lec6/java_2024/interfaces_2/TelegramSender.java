package lec6.java_2024.interfaces_2;

public class TelegramSender implements Sender{
    @Override
    public void send(String string) {
        System.out.println("Telegram: + " + string);
    }
}
