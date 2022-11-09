package lec6;

import lec4.dataStructure.LinkedList;
import lec4.dataStructure.Node;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {


        IterableLinkedList linkedList = new IterableLinkedList();

        linkedList.push(5);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(4);


        for(int value : linkedList){
            System.out.println(value);
        }
    }

    public static class IterableLinkedList extends LinkedList implements Iterable<Integer>{
        public IterableLinkedList() {

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
