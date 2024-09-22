package lec9.solid;

public class D {

    public static void main(String[] args) {
        CrudRepository crudRepository = new MySQLCrudRepository();
        EmailSender emailSender = new JavaEmailSender();

        OrderProcessor orderProcessor = new OrderProcessor(crudRepository, emailSender);

        orderProcessor.process();

    }


    static class OrderProcessor{
        private CrudRepository crudRepository;
        private EmailSender emailSender;

        public OrderProcessor(CrudRepository crudRepository, EmailSender emailSender) {
            this.crudRepository = crudRepository;
            this.emailSender = emailSender;
        }

        void process(){
            crudRepository.save();
            emailSender.send();
        }
    }


    interface CrudRepository{
        void save();
    }

    static class MSSQLCrudRepository implements CrudRepository{
        public void save(){}
    }

    static class MySQLCrudRepository implements CrudRepository{
        public void save(){}
    }

    interface EmailSender{
        void send();
    }

    static class JavaEmailSender implements EmailSender{
        public void send(){}
    }
}
