public class Main {
    String studentName;
    int seatNumber;

    Main(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        Main priya = new Main("Priya", 0);
        Main copy = priya;
        copy.seatNumber = 45;

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        Main separate = new Main("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}

