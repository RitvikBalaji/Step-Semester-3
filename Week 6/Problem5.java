public class Main {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Main(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        Main employee1 = new Main("Divya", 65000);
        Main employee2 = new Main("Arjun", 55000);
        Main employee3 = new Main("Ravi", 60000);
        Main.printCompanyInfo();
    }
}

