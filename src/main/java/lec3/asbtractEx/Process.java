package lec3.asbtractEx;

public abstract class Process {
    public int invoke() {
        System.out.println("Process invoke");
        System.out.println(invokeString());

        return 1;
    };

    //метод може бути абстрактним і без реалізації
    //може викликатися у invoke методі
    public abstract String invokeString();
}
