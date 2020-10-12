package lec3.asbtractEx;

public class AbstractExample {
    public static void main(String[] args) {

        //абстрактний клас не може мати екземплярів
//    Process process = new Process();

        NumberProcess numberProcess = new NumberProcess();

        int i = numberProcess.invoke();

        System.out.println(i);
    }
}
