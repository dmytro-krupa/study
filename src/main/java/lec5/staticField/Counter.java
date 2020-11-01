package lec5.staticField;

public class Counter {
    //теж можна оголосити так. Не ініціалізоване поле int завжди рівне 0.
    //але краще так не робити
//    public static int counter;

    public  int counter = 0;

    public static void print(){
        System.out.println("static");
    }
    public void printe(){
        System.out.println("printwe");
        print();
    }

    private Counter(int counter) {
        this.counter = counter;
    }

    public static Counter createCounter(int counter){
        return new Counter(counter);
    }

}
