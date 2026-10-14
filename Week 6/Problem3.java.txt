public class Main {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Main(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Main(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {
        Main employee1 = new Main("E-101", "Divya", 65000);
        Main employee2 = new Main("E-102", "Arjun");
        employee1.printProfile();
        employee2.printProfile();
    }
}

