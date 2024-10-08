package lec4.old.staticField;

public class Counter {
    //теж можна оголосити так. Не ініціалізоване поле int завжди рівне 0.
    //але краще так не робити
//    public static int counter;

    public static int counter = 0;
    public int notStatic;

    public static void printStatic(){
        System.out.println("static");
    }
    public void print(){

        System.out.println("print");
        printStatic();
    }

    private Counter(int notStatic) {
        this.notStatic = notStatic;
    }


    public Counter() {
    }

    public static Counter createCounter(int counter){
        return new Counter(counter);
    }

    public static Counter createEmptyCounter(){
        return createCounter(5);
    }
}
