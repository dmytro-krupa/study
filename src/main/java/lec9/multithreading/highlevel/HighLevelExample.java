package lec9.multithreading.highlevel;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HighLevelExample {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(5);

//        executor.submit(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (Exception e){
//
//            }
//
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        });

//        System.out.println("after submit");

        Example get123 = new Example();

        Future<Integer> x = executor.submit(() -> {
            String threadName = Thread.currentThread().getName();

            System.out.println("Hello " + threadName);

            Thread.sleep(5000);
            System.out.println("Bye " + threadName);

            return 123;
        });

//        Thread.sleep(1000);
        System.out.println("after 1 sec");


//        Thread.sleep(5000);

        System.out.println("finish");
        System.out.println(x.get());
        System.out.println("finished x.get()");


//
//
        try{
            executor.shutdown();
        } catch (Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }

    }

    static class Example implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            String threadName = Thread.currentThread().getName();

            System.out.println("Hello from Example object in: " + threadName);

            Thread.sleep( 5000);
            System.out.println("Bye " + threadName);

            return 123;
        }
    }
}
