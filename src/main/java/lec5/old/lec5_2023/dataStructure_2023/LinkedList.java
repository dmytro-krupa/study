package lec5.old.lec5_2023.dataStructure_2023;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
    private Node<T> head;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);

        if(this.head == null){
            this.head = node;
        } else {
            Node<T> lastNode = findLastNode(this.head);
            lastNode.setNext(node);
        }
    }

    @Override
    public T get(int index) {
        Node<T> pointer = this.head;

//        if(index > size() - 1){
//            return -3;
//        }

        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();
        }

        return pointer.getValue();
    }

    @Override
    public void print() {
        print(this.head);
    }

    public void clear(){
        this.head = null;
    }

    @Override
    public int size() {
        int size = 0;

        Node<T> pointer = this.head;

        while (pointer != null){
            size++;
            pointer = pointer.getNext();
        }


        return size;
    }

    private void print(Node<T> head){
        if(head == null) {
            return;
        }

        System.out.println(head.getValue());

        if (head.getNext() != null){
            print(head.getNext());
        }
    }

    private Node<T> findLastNode(Node<T> head){
        if (head.getNext() == null){
            return head;
        } else {
            return findLastNode(head.getNext());
        }
    }
}
/*
    List --(head)--> (7, next) --(next)--> (10)
 */
