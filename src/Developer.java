public class Developer extends Employee {
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, int employeeId, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(this.name + " joined as a " + this.programmingLanguage + " Developer");
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (projectsCompleted * 1000);
    }

    @Override
    public void work() {
        System.out.println(this.name + " is coding in " + this.programmingLanguage);
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}