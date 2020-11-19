package lec9.multithreading;

public class SimpleMultiThExample {

    /*
    теорія:
    1. Потік і процес
    2. synchronized - кожен об'єкт має монітор - тобто певний об'єкт який за ним стежить. synchronized - локає монітор для одного потоку

    можливі проблеми:
    1. deadlock - два потоки блокують одне одного
    2. race condition - робота програми залежить від правильності виклику потоків
     */
    public static void main(String[] args) {
//        Calculations.calc1();
//        Calculations.calc2();
//        Calculations.calc3();
        //======================================================

//
        SimpleThread1 simpleThread1 = new SimpleThread1();
        SimpleThread2 simpleThread2 = new SimpleThread2();
        SimpleThread3 simpleThread3 = new SimpleThread3();

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();

//
//        try {
//            Thread.sleep(4000);
//        } catch (Exception e){
//            //don't do that
//        }
//
//        simpleThread2.interrupt();



        //======================================================

//
//        Thread thread1 = new Thread(new SimpleRunnable1());
//        Thread thread2 = new Thread(new SimpleRunnable2());
//        Thread thread3 = new Thread(new SimpleRunnable3());
//
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
    }

    public static class SimpleThread1 extends Thread{
        @Override
        public void run() {
            Calculations.calc1();
        }
    }
    public static class SimpleThread2 extends Thread{
//        private boolean shouldBeStopped = false;
//
//        public void stopThread(){
//            this.shouldBeStopped = true;
//        }

        @Override
        public void run() {

//            while (!isInterrupted()){
//            while (!shouldBeStopped){
                Calculations.calc2();
//            }

        }
    }
    public static class SimpleThread3 extends Thread{
        @Override
        public void run() {
            Calculations.calc3();
        }
    }


    //======================================================


    public static class SimpleRunnable1 implements Runnable{
        @Override
        public void run() {
            Calculations.calc1();
        }
    }

    public static class SimpleRunnable2 implements Runnable{
        @Override
        public void run() {
            Calculations.calc2();
        }
    }

    public static class SimpleRunnable3 implements Runnable{
        @Override
        public void run() {
            Calculations.calc3();
        }
    }
}
