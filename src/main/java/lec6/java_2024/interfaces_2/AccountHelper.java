package lec6.java_2024.interfaces_2;

import java.util.*;

public class AccountHelper {

    public void sendMoney(long senderId, long targetAccountId, int money, Iterable<Sender> senders){
        //
        // код що використовує параметри вище.
        //

        for(var sender : senders){
            sender.send("some message");
        }
    }







}
