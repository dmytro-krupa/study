package lec4;

public class MethodOverloadExample {
    public static void main(String[] args) {
        f(4, "");
       int x = f(4, "");
//        f();
//        f(1);
//        f();

        var a = 3;

//        someMethod(a, 0, null);
    }


//    static void square(int a){
//        rectangle(a, a);
//    }
//    static void rectangle(int a, int b){}

//    static void someMethod(int a){
//        someMethod(a, 0, null);
//        //....
//    }
//
//    static void someMethod(int a, double b, Object x){
//        //....
//    }
//


    static void f(){
        System.out.println("void f()");
    }

    static int f(int i){
        System.out.println("int f(int)");
        return 1;
    }
    static int f(long i){
        System.out.println("int f(long)");
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
