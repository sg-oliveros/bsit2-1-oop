import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books = new ArrayList<>(Arrays.asList("Java Programming","Web Development","Database Design"));

    Scanner scanner = new Scanner(System.in);
    public void showBooks() {
        try{
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized!");
            }
            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("Currently no books available in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }

    }
    public void addBook() {
        try {
            System.out.print("\nEnter book title to add: ");
            String bookTitle = scanner.nextLine().trim();

            if (bookTitle == null || bookTitle.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (bookTitle.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(bookTitle);
            System.out.println("Book '" + bookTitle + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
        }
    }
    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("\nNo books available to remove!");
                return;
            }

            System.out.print("\nEnter book number to remove (1-" + books.size() + "): ");
            String indexInput = scanner.nextLine();

            int index;
            try {
                index = Integer.parseInt(indexInput) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
                return;
            }

            if (index < 0) {
                throw new IllegalArgumentException("Book number cannot be negative!");
            }
            if (index >= books.size()) {
                throw new ArrayIndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
        }
    }
}
