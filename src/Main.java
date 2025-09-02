public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        System.out.println("≡ Library Management System ≡");

        library.showBooks();
        library.addBook();
        library.addBook();
        library.addBook();
        library.removeBook();
        library.removeBook();
        library.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
