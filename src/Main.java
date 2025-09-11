public class Main {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===\n");

        Manager manager = new Manager("Alice Smith", 2001, 80000.0, "Engineering", 15000.0, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000.0, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000.0, "Engineering", "Tech University", true);

        System.out.println();

        // Displays Manager details
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());

        System.out.println();

        // Displays Developer details
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());

        System.out.println();

        // Displays Intern details
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}