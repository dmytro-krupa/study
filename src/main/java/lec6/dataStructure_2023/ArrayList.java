package lec6.dataStructure_2023;

import java.util.Iterator;

public class ArrayList<T> implements List<T> {
    private Node<T>[] nodes;
    private int index = 0; //приймемо ідею, що index - останній вільний елемент

    public ArrayList() {
        this(10);
    }

    public ArrayList(int length) {
        nodes = new Node[length];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T>{
        private int pointer = 0;
        @Override
        public boolean hasNext() {
            return pointer < index;
        }

        @Override
        public T next() {
            final T tmp = nodes[pointer].getValue();
            pointer++;
            return tmp;
        }
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (nodes.length == index) {
            extendArray();
        }

        nodes[index] = node;
        ++index;
    }

    private void extendArray() {
        Node[] newArray = new Node[this.nodes.length + 10];

        for (int i = 0; i < this.nodes.length; i++) {
            newArray[i] = this.nodes[i];
        }

        this.nodes = newArray;
    }

    @Override
    public T get(int index) {
//        if (index > nodes.length - 1) {
//            //FIXME: use exception instead of this -2
//            return -2;
//        }
//
//        if (nodes[index] == null) {
//            //FIXME: use exception instead of this -1
//            return -1;
//        }
        return nodes[index].getValue();
    }

    @Override
    public void print() {
        for (Node node : nodes) {
            if (node == null) {
                return;
            }
            System.out.println(node.getValue());
        }
    }

    @Override
    public int size() {
        return index;
    }
}
