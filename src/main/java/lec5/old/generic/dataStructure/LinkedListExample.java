package lec5.old.generic.dataStructure;

public class LinkedListExample {
    public static void main(String[] args) {
        Node node1 = new Node("fr", null); //tail
        Node<Integer> node2 = new Node<>(600, node1);
        Node<Integer> node3 = new Node<>(-98, node2);
        Node<Integer> node4 = new Node<>(0, node3); //head





        Queue<Integer> queue = new LinkedList<>(node4);




//        System.out.println(linkedList.size());
//        System.out.println("Size = " + queue.size());


//        queue.read();


        int result = queue.get();

        System.out.println("Last element is: " + result);
    }
}
