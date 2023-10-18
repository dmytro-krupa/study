package lec4.dataStructure_2023;

public class LinkedList implements List{
    private Node head;

    @Override
    public void add(int value) {
        Node node = new Node(value);

        if(this.head == null){
            this.head = node;
        } else {
            Node lastNode = findLastNode(this.head);
            lastNode.setNext(node);
        }
    }

    @Override
    public int get(int index) {
        Node pointer = this.head;

        if(index > size() - 1){
            return -3;
        }

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

        Node pointer = this.head;

        while (pointer != null){
            size++;
            pointer = pointer.getNext();
        }


        return size;
    }

    private void print(Node head){
        if(head == null) {
            return;
        }

        System.out.println(head.getValue());

        if (head.getNext() != null){
            print(head.getNext());
        }
    }

    private Node findLastNode(Node head){
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
