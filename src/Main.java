public class Main{
    public static void main(String[]args){
    System.out.println("Student Information:");

    Student student1 = new Student("Samantha Oliveros", "18", "BSIT", 89.97, 90.9,89.7);
    Student student2 = new Student("Alice Thames ", "20", "BSIT", 90, 89,87);
    Student student3 = new Student("James Mendoza", "19", "BSIT", 75, 80,76);


    student1.displayInfo();
    student1.getLetterGrade();
    student1.isPassing();
    student1.calculateAverage();
    System.out.println(" ");

    student2.displayInfo();
    student2.getLetterGrade();
    student2.isPassing();
    student2.calculateAverage();
    System.out.println(" ");

    student3.displayInfo();
    student3.getLetterGrade();
    student3.isPassing();
    student3.calculateAverage();

    System.out.println(" ");
    System.out.println("Summary: 2 out of 3 students are passing.");
    }
}

