
public class Problem4 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeFirst(Node head, String booking) {
        if (head == null) {
            System.out.println(booking + " not found");
            return null;
        }

        if (head.data.equals(booking)) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data.equals(booking)) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }

        System.out.println(booking + " not found");
        return head;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node("104");
        head1.next = new Node("101");
        head1.next.next = new Node("107");
        head1.next.next.next = new Node("101");

        head1 = removeFirst(head1, "101");
        display(head1);

        Node head2 = new Node("104");
        head2.next = new Node("101");
        head2.next.next = new Node("107");

        head2 = removeFirst(head2, "104");
        display(head2);

        Node head3 = new Node("104");
        head3.next = new Node("101");

        head3 = removeFirst(head3, "200");
        display(head3);
    }
}
