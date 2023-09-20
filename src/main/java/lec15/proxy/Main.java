package lec15.proxy;

public class Main {
    public static void main(String[] args) {
        Heavy heavy = new Proxy();

        System.out.println(heavy.getString());
        System.out.println(heavy.getString());
        System.out.println(heavy.getString());
    }
}
