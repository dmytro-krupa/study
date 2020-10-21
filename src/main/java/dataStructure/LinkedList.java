package dataStructure;

public class LinkedList {
    private Node head;

    /*
    Теми:
        1. Як працює збирач сміття
        2. Метод finalize
        3. Структури даних: FIFO, LIFO, дерево, стек, черга
        4. Складність алгоритмів (коду)
     */

    /*
    TASKS:
        1. remove this constructor
        2. add private default constructor
        3. add static method to create a list
        4. create second interface
        5. add method add(int value)
        6. add method delete(int index)
        7. add method deleteByValue(int value) - remove first value
        9. add method clear()

     */

    public LinkedList(Node head) {
        this.head = head;
    }

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

}
