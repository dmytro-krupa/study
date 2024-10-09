package lec6.java_2024.interfaces_2;

public class AccountService {
    private final EmailSender emailSender;
    private final SMSSender smsSender;

    public AccountService(EmailSender emailSender, SMSSender smsSender) {
        this.emailSender = emailSender;
        this.smsSender = smsSender;
    }

    public void sendMoney(long senderId, long targetAccountId, int money){
        //
        // код що використовує параметри вище.
        //



        emailSender.send("body for email");
        smsSender.send("some sms");
    }
}
