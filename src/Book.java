public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty.");
        }
        if (isbn == null || (isbn.length() != 10 && isbn.length() != 13)) {
            throw new IllegalArgumentException("Invalid ISBN. ISBN must be exactly 10 or 13 characters long.");
        }
        if (yearPublished < 1450 || yearPublished > 2025) {
            throw new IllegalArgumentException("Invalid year provided. Year must be between 1450 and 2025.");
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public String setTitle() {
        return title;
    }

    public String setAuthor(){
        return author;
    }

    public String setIsbn() {
        return isbn;
    }

    public int setYearPublished() {
        return yearPublished;
    }

    public boolean setAvailable() {
        return isAvailable;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            this.isAvailable = true;
            return true;
        }
        return false;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year: " + yearPublished);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}