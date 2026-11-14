
public class Problem2 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addFirst(Node head, String name) {
        Node newNode = new Node(name);
        newNode.next = head;
        return newNode;
    }

    public static Node addLast(Node head, String name) {
        Node newNode = new Node(name);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node("Asha");
        head1.next = new Node("Ravi");

        head1 = addFirst(head1, "Neha");
        head1 = addLast(head1, "Kiran");
        head1 = addFirst(head1, "Mohan");

        display(head1);

        Node head2 = null;

        head2 = addLast(head2, "Pooja");
        head2 = addFirst(head2, "Arun");

        display(head2);
    }
}
