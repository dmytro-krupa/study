package lec4.staticField;

public class StaticFieldExample {
    public static void main(String[] args) {
//
//        Increment a = new Increment();
//
//        a.increment();
//        a.increment();
//        a.increment();
//
//        System.out.println(Counter.counter);
//
//
//        Increment b = new Increment();
//
//        b.increment();
//        b.increment();
//        a.increment();
//        b.increment();
////
//        System.out.println(Counter.counter);


        Counter counter = Counter.createEmptyCounter();

        System.out.println(counter.notStatic);


        Counter counter1 = new Counter();
    }

    public void print(){
        System.out.println("TEST");
    }

}
