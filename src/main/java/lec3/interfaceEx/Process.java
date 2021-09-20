package lec3.interfaceEx;

public interface Process extends SuperProcess{
    //одночасно є public, static i final
    //з java 1
    int VALUE = 5;


    //завжди public
    //з java 1
    int invoke();

    //з java 9
    private void q(){
        System.out.println("private log");
    }

    //непотрібно імплементувати
    //з java 8
    default void log(){
        System.out.println("default log");
    }

    //не може бути перевизначеним
    //з java 8
    static void staticLog(){

        System.out.println("static log");
    }

}
