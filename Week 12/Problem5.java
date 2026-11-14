
public class Problem5 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;
    static int size = 0;

    public static void push(String plate) {
        Node newNode = new Node(plate);
        newNode.next = top;
        top = newNode;
        size++;

        System.out.println("push " + plate + " -> top " + top.data + ", size " + size);
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("pop -> stack is empty");
            return;
        }

        String plate = top.data;
        top = top.next;
        size--;

        System.out.println("pop -> " + plate + ", size " + size);
    }

    public static void peek() {
        if (isEmpty()) {
            System.out.println("peek -> stack is empty");
        } else {
            System.out.println("peek -> " + top.data);
        }
    }

    public static boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        push("P1");
        push("P2");
        peek();
        pop();
        push("P3");
        pop();
        pop();
        pop();
        System.out.println("isEmpty -> " + isEmpty());
    }
}
