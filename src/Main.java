public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        System.out.println("=== Library Management System ===\n");

        System.out.println("Adding books to library...");
        try {
            Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
            Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
            Book book3 = new Book("Web Development", "Mike Johnson", "5555566677", 2021);

            myLibrary.addBook(book1);
            myLibrary.addBook(book2);
            myLibrary.addBook(book3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
        System.out.println();

        myLibrary.displayAllBooks();
        System.out.println();

        System.out.println("Borrowing Java Programming...");
        myLibrary.borrowBook("1234567890");
        System.out.println();

        System.out.println("Trying to borrow Java Programming again...");
        myLibrary.borrowBook("1234567890");
        System.out.println();

        myLibrary.displayAvailableBooks();
        System.out.println();

        System.out.println("Returning Java Programming...");
        myLibrary.returnBook("1234567890");
        System.out.println();

        System.out.println("Testing validation...");
        try {
            Book invalidBook1 = new Book("Invalid Year", "Author", "1234567890", 1449);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Book invalidBook2 = new Book("Invalid ISBN", "Author", "123", 2022);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}