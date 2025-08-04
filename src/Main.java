public class Main{
    public static void main(String[]args) {

        Book book1 = new Book("Lucid Dreams", "Alyloony", 280);
        Book book2 = new Book("Harry Potter", "JK Rowling", 1250);
        Book book3 = new Book("Project Loki", "Akosiibarra", 600);

        System.out.println();
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println();
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        System.out.println();
        book3.displayInfo();
        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}

class Book{
    String title;
    String author;
    int pages;
    boolean isAvailable = true;

    Book(String bookTitle, String bookAuthor, int bookPages){
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    void displayInfo(){
        System.out.println("Book Title: '"+ title +"'");
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    void borrowBook(){
        isAvailable = false;
        System.out.println("You have borrowed '" + title + "'.");
    }

    void returnBook(){
        isAvailable = true;
        System.out.println("You have successfully returned the book '" + title +"'.");
    }
}
