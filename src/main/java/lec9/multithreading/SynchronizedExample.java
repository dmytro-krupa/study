package lec9.multithreading;

public class SynchronizedExample {
    public static void main(String[] args) {
        Resource resource = new Resource();

        for(int i = 0; i < 5; i++){
            Thread thread = new Thread(new Sync(resource));
            thread.start();
        }
    }

    static class Sync implements Runnable{

        Resource resource;

        public Sync(Resource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            synchronized (this){
                for(int i = 0; i < 5; i++){
                    ++resource.i;
                    System.out.printf("%s %d \n", Thread.currentThread().getName(), resource.i);
                    try{
                        Thread.sleep(100);
                    }
                    catch(InterruptedException e){}
                }
            }
        }
    }
}
