package lec9.solid;

public class D {
    class OrderProcessor{
        void process(){
            MSSQLCrudRepository mssqlCrudRepository = new MSSQLCrudRepository();
            mssqlCrudRepository.save();

            ApproveEmailSender approveEmailSender = new ApproveEmailSender();
            approveEmailSender.send();
        }
    }


    class MSSQLCrudRepository{
        void save(){}
    }

    class ApproveEmailSender{
        void send(){}
    }
}
