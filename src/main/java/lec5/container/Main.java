package lec5.container;

public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>();

        list.add(new Container<>("1+"));
        list.add(new Container<>("4+"));
        list.add(new Container<>("2+"));
        list.add(new Container<>("3+"));

//        list.add(2);

        list.print();
    }
}
