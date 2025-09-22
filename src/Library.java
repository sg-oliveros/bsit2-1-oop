public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 10;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.setTitle() + " by " + book.setAuthor());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].setIsbn().equals(isbn)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // Clear the last element
                bookCount--;
                System.out.println("Book with ISBN " + isbn + " removed successfully.");
                return true;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].setIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.returnBook()) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book is already in the library.");
            }
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("All books in library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].setTitle() + " | Author: " + books[i].setAuthor() + " | ISBN: " + books[i].setIsbn() + " | Year: " + books[i].setYearPublished() + " | Status: " + (books[i].setAvailable() ? "Available" : "Borrowed"));
        }
    }

    public void displayAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].setAvailable()) {
                System.out.println("Title: " + books[i].setTitle() + " | Author: " + books[i].setAuthor() + " | ISBN: " + books[i].setIsbn() + " | Year: " + books[i].setYearPublished() + " | Status: " + (books[i].setAvailable() ? "Available" : "Borrowed"));
            }
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}