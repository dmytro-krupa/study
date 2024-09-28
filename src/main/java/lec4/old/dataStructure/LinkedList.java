package lec4.old.dataStructure;

public class LinkedList implements Stack{
    protected Node head;
    protected Node tail;

    protected LinkedList() {
        this.head = null;
    }

    public static LinkedList emptyStack(){
        return new LinkedList();
    }

    @Override
    public void push(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            return;
        } else {
            Node last = getLast();
            last.setNext(newNode);
        }
    }

    @Override
    public int pop() {
        if(head == null){
            return -1;
        }

        if(head.getNext() == null){
            Node temp = head;
            head = null;
            return temp.getValue();
        }

        Node secondLast = getSecondLast();

        Node last = secondLast.getNext();
        secondLast.setNext(null);


        return last.getValue();
    }

    private Node getLast(){
        Node pointer = this.head;

        if(pointer.getNext() == null){
            return pointer;
        }

        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }

        return pointer;
    }

    private Node getSecondLast(){
        Node pointer = this.head;

        if(pointer.getNext().getNext() == null){
            return pointer;
        }

        while (pointer.getNext().getNext() != null){
            pointer = pointer.getNext();
        }

        return pointer;
    }


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

}
