package lec4.dataStructure;

public class LinkedListExample {
    public static void main(String[] args) {
        Node node1 = new Node(7, null); //tail
        Node node2 = new Node(600, node1);
        Node node3 = new Node(-98, node2);
        Node node4 = new Node(0, node3); //head

        LinkedList linkedList = new LinkedList(node4);

//        System.out.println(linkedList.size());
        System.out.println(linkedList.get());
    }
}
