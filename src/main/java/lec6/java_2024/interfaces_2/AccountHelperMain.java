package lec6.java_2024.interfaces_2;

import study.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AccountHelperMain {
    public static void main(String[] args) {
        AccountHelper accountHelper = new AccountHelper();

        long senderId = 1L;

        List<Sender> senderList = getSenders(senderId);

        accountHelper.sendMoney(senderId, 2L, 100, senderList);
    }

    static List<Sender> getSenders(long senderId){
        List<Sender> senders = new ArrayList<>();

        senders.add(new EmailSender());
        senders.add(new PushSender());
        senders.add(new TelegramSender());

        return senders;
    }
}
