package lec4;

public class MethodOverloadExample {
    public static void main(String[] args) {
        f(4, "");
        f();
        f(1);

        f();

    }


    class User{}

    void updateUser(User user, boolean isEditedByAdmin){}

    void updateUser(User user){
        updateUser(user, false);
    }






    static void f(){
        System.out.println("void f()");
    }

    static int f(int i){
        System.out.println("int f(int)");
        return 1;
    }
    static int f(long i){
        System.out.println("long f(int)");
        return 1;
    }





    static int f(int i, String s){
        System.out.println("int f(int, String)");
        return 1;
    }

    static int f(String s, int i){
        System.out.println("int f(String, int)");
        return 1;
    }

    //приклад нижче неможливо однозначно визначити

//    static void f(String s, int i){
//        System.out.println("int f(String, int)");
//    }
}
