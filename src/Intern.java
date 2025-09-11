public class Intern extends Employee {
    private String university;
    private boolean isFullTime;

    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean isFullTime) {
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.isFullTime = isFullTime;
        System.out.println("Intern " + this.name + " from " + this.university + " has started");
        System.out.println("University: " + university);
        System.out.println("Full-time: " + isFullTime);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 0.5;
    }

    @Override
    public void work() {
        System.out.println(this.name + " is learning and assisting with tasks");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        super.displayInfo();
        System.out.println("University: " + university);
        System.out.println("Full-time: " + isFullTime);
    }
}