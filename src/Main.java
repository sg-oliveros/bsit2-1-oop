public class Main {
    public static void main(String[] args) {
        System.out.println("== Book Record System ==\n");
        System.out.println("Adding books and ratings...");


        TestBook book1 = new TestBook("Java Programming", "John Smith");
        TestBook book2 = new TestBook("Data Structures", "Alice Brown");
        TestBook book3 = new TestBook("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book1.addMultipleRatings(5, 4, 3, 4);
            System.out.println("Ratings added: 5, 4, 3, 4");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

            book2.addRating(5);
            book2.addMultipleRatings(4, 3, 4, 5);
            book3.addRating(3);
            book3.addMultipleRatings(3, 3, 4, 3);

        try {
            book2.addRating(0); // Invalid rating
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("\nTotal books created: " + TestBook.getTotalBooks());

        TestBook highestRatedBook = book1;
        for (TestBook books : new TestBook[]{book1, book2, book3}) {
            if (books.getAverageRating() > highestRatedBook.getAverageRating()) {
                highestRatedBook = books;
            }
        }

        System.out.println("Highest rated book: " + highestRatedBook.getTitle() + " by "
                + highestRatedBook.getAuthor() + " (" + highestRatedBook.getAverageRating() + ")");
    }
}
