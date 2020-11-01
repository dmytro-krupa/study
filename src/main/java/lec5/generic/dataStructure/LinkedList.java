package lec5.generic.dataStructure;

public class LinkedList<T> implements Queue<T> {
    private Node<T> head;

    /*
    Теми:
        1. Як працює збирач сміття
        2. Метод finalize
        3. Структури даних: дерево, стек==LIFO, черга==FIFO
        4. Складність алгоритмів (коду)
     */

    /*
    TASKS:
        1. remove this constructor
        2. add private default constructor
        3. add static method to create a list

        5. add method add(int value)
        6. add method delete(int index)
        7. add method clear()

     */

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    @Override
    public int size(){
        int size = 0;

        if (head == null){
            return size;
        }

        Node<T> headPointer = head;

        while (headPointer != null){
            ++size;
            headPointer = headPointer.getNext();
        }

        return size;
    }

    @Override
    public T get(){
        Node<T> headPointer = head;

        if (head == null){
            return null;
        }

        while (headPointer.getNext() != null){
            headPointer = headPointer.getNext();
        }

        return headPointer.getValue();
    }

    @Override
    public void add(T value) {
        //потрібно замінити існуючий head
        //створити новий об'єкт Node
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void read() {
        Node<T> headPointer = head;

        if (head == null){
            System.out.println("null");
        }

        while (headPointer.getNext() != null){
            System.out.println(headPointer.getValue());
            headPointer = headPointer.getNext();
        }

        System.out.println(headPointer.getValue());

    }
}
