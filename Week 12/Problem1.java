
public class Problem1 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node build(String[] stops) {
        Node head = null;
        Node tail = null;

        for (String stop : stops) {
            Node newNode = new Node(stop);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static void printRoute(Node head) {
        Node temp = head;
        int count = 0;
        String first = head.data;
        String last = "";

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp.data;
            count++;
            temp = temp.next;
        }

        System.out.println("null");
        System.out.println("Stops: " + count + ", First: " + first + ", Last: " + last);
    }

    public static void main(String[] args) {
        String[] stops1 = {"Tambaram", "Guindy", "TNagar", "Central"};
        String[] stops2 = {"Potheri"};

        Node head1 = build(stops1);
        printRoute(head1);

        Node head2 = build(stops2);
        printRoute(head2);
    }
}
