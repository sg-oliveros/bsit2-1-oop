import java.util.Scanner;

public class Main {
    static int number = 0;

    public static void main(String[] args) {

        System.out.println("Please input 5 numbers.");
            Scanner scan = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter number " + i + ": " );
                    number = number + scan.nextInt();

        }
        System.out.println(" ");
        System.out.println("Total Number: " + number);

        scan.close();
    }
}
