package lec5.staticField;

public class StaticFieldExample {
    public static void main(String[] args) {
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
//        b.increment();
//
//        System.out.println(Counter.counter);


        Counter counter = Counter.createCounter(5);

        System.out.println(counter.counter);

    }
}
