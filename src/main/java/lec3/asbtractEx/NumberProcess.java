package lec3.asbtractEx;

public class NumberProcess extends Process{
    @Override
    public int invoke() {
        //приклад використання ключового слова super
//        System.out.println("Some log");
//        return super.invoke();


        System.out.println("NumberProcess invoke");
        return 42;
    }

    @Override
    public String invokeString() {
        return "invokeString()";
    }
}
