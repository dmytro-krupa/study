package lec9.multithreading;

public class Calculations {
    public static void calc1(){
        System.out.println("calc1 started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("calc1 finished");
    }

    public static void calc2(){
        System.out.println("calc2 started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }
        System.out.println("calc2 finished");
    }

    public static void calc3(){
        System.out.println("calc3 started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("calc3 finished");
    }
}
