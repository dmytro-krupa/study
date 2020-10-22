package lec4.dataStructure;

public class LinkedListExample {
    public static void main(String[] args) {
        Node node1 = new Node(7, null); //tail
        Node node2 = new Node(600, node1);
        Node node3 = new Node(-98, node2);
        Node node4 = new Node(0, node3); //head

        Queue queue = new LinkedList(node4);

        queue.add(7);
        queue.add(600);
        queue.add(-98);
        queue.add(0);



//        System.out.println(linkedList.size());
        System.out.println(queue.get());


    }
}
