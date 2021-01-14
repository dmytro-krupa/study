package lec9.multithreading.highlevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HighLevelExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });


        try {
           Future<Integer> x = executor.submit(() -> {
               String threadName = Thread.currentThread().getName();

               System.out.println("Hello " + threadName);

               Thread.sleep( 5000);
               System.out.println("Bye " + threadName);

               return 123;
           });

            Thread.sleep( 1000);
            System.out.println("after 1 sec");


            Thread.sleep( 1000);

            System.out.println("finish");
            System.out.println(x.get());
//            System.out.println(x.get(1, TimeUnit.SECONDS));
        } catch (Exception e){
            e.printStackTrace();
        }



        try{
            executor.shutdown();
        } catch (Exception e){
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }

    }
}
