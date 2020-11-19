package lec9.multithreading.wait;

public class Store {
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Customer bought 1 product");
        System.out.println("Products left: " + product);
        notify();
    }
    public synchronized void put() {
        while (product>=3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("1 product was produced");
        System.out.println("Products left: " + product);
        notify();
    }
}
