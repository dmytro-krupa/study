package lec3.constructor.practice;

public class Admin extends User{

    private Admin(String email) {
        super(email);
    }

    public static Admin generateMainAdmin(){
        return new Admin("admin@admin.net");
    }
}
