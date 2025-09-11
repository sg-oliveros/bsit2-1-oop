public class Manager extends Employee {
    private double bonus;
    private int teamSize;

    public Manager(String name, int employeeId, double baseSalary, String department, double bonus, int teamSize) {
        super(name, employeeId, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(this.name + " has been promoted to Manager");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.name + " is managing a team of " + this.teamSize + " employees");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize + " employees");
    }
}