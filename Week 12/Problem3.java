
public class Problem3 {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static String find(Node head, String id) {
        int position = 1;
        int first = -1;
        int copies = 0;

        Node temp = head;

        while (temp != null) {
            if (temp.data.equals(id)) {
                if (first == -1) {
                    first = position;
                }
                copies++;
            }
            position++;
            temp = temp.next;
        }

        if (first == -1) {
            return id + " not found";
        }

        return id + " first at position " + first + ", copies: " + copies;
    }

    public static void main(String[] args) {
        Node head = new Node("B12");
        head.next = new Node("B07");
        head.next.next = new Node("B30");
        head.next.next.next = new Node("B07");
        head.next.next.next.next = new Node("B45");
        head.next.next.next.next.next = new Node("B07");

        System.out.println(find(head, "B07"));
        System.out.println(find(head, "B99"));
    }
}
