package lec6;

import lec4.dataStructure.LinkedList;
import lec4.dataStructure.Node;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {


        Node node1 = new Node(7, null); //tail
        Node node2 = new Node(600, node1);
        Node node3 = new Node(-98, node2);
        Node node4 = new Node(0, node3); //head


        IterableLinkedList linkedList = new IterableLinkedList(node4);

        for(int value : linkedList){
            System.out.println(value);
        }
    }

    public static class IterableLinkedList extends LinkedList implements Iterable<Integer>{
        public IterableLinkedList(Node head) {
            super(head);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new LinkedListIterator();
        }

        private class LinkedListIterator implements Iterator<Integer>{

            Node next = head;

            @Override
            public boolean hasNext() {
                return next != null;
            }

            @Override
            public Integer next() {
                int value = next.getValue();
                next = next.getNext();
                return value;
            }
        }

    }
}
