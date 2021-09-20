package lec4.dataStructure;

public class LinkedList implements Queue{
    protected Node head;

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

    public LinkedList(Node head) {
        this.head = head;
    }


    public LinkedList() {
    }

    @Override
    public int size(){
        int size = 0;

        if (head == null){
            return size;
        }

        Node headPointer = head;

        while (headPointer != null){
            ++size;
            headPointer = headPointer.getNext();
        }

        return size;
    }

    @Override
    public int get(){
        Node headPointer = head;

        if (head == null){
            return 0;
        }

        while (headPointer.getNext() != null){
            headPointer = headPointer.getNext();
        }

        return headPointer.getValue();
    }

    @Override
    public void add(int value) {
        //потрібно замінити існуючий head
        //створити новий об'єкт Node
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void clear() {

    }
}
