package lec3.interfaceEx;

public interface Process extends SuperProcess{
    //одночасно є public, static i final
    int VALUE = 5;


    //завжди public
    int invoke();


    //непотрібно імплементувати
    default void log(){
        System.out.println("default log");
    }

    //не може бути перевизначеним
    static void staticLog(){
        System.out.println("static log");
    }

}
