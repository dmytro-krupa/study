package lec4.old.dataStructure;

public class LinkedListExample {
    public static void main(String[] args) {
        Stack stack = LinkedList.emptyStack();

        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(4);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
