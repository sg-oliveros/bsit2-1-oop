import java.util.Scanner;

public class Main{
    static String studentID = "";
    static String firstName = "";
    static String lastName = "";
    static String course = "";
    static String section = "";

    static int midtermScore = 0;
    static int finalScore = 0;
    static int projectScore = 0;
    static int attendancePercentage = 0;

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER STUDENT INFORMATION");

        System.out.print("Student ID:");
            studentID = scan.nextLine();

        System.out.print("Student First Name:");
            firstName = scan.nextLine();

        System.out.print("Student Last Name:");
            lastName = scan.nextLine();

        System.out.print("Course:");
            course = scan.nextLine();

        System.out.print("Section:");
            section = scan.nextLine();

        System.out.println("ENTER STUDENT SCORES:");

        System.out.print("Midterm Exam Score:");
            midtermScore = scan.nextInt();

        System.out.print("Final Exam Score:");
            finalScore = scan.nextInt();

        System.out.print("Project Score:");
            projectScore = scan.nextInt();

        System.out.print("Attendance Percentage:");
            attendancePercentage = scan.nextInt();

        System.out.println(" ");
        System.out.println("STUDENT INFORMATION:");
        System.out.println("Student Id:" + studentID);
        System.out.println("Student Name:" + firstName + " " + lastName);
        System.out.println("Course:" + course);
        System.out.println("Section:" + section);

        System.out.println(" ");
        System.out.println("STUDENT SCORE:");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendancePercentage);

        double averageScore = (midtermScore + finalScore + projectScore + attendancePercentage )/ 400d;
            System.out.println("Average Score: "  + averageScore * 100);

        if(averageScore <= 0.75){
            System.out.println("REMARKS: FAILED");
        } else{
            System.out.println("REMARKS: PASSED");
        }

    }
}
