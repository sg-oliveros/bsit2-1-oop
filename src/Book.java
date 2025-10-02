public class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private int numberOfPages;
    private String genre;

    public Book(String isbn, String itemId, String title, String author, int numberOfPages, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        setNumberOfPages(numberOfPages);
        setGenre(genre);
    }

    public String getIsbn() { return isbn; }
    public int getNumberOfPages() { return numberOfPages; }
    public String getGenre() { return genre; }

    public void setGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            System.err.println("Genre cannot be null or empty. Setting to 'Unknown'.");
            this.genre = "Unknown";
        } else {
            this.genre = genre;
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            System.err.println("Book: Number of pages must be positive. Setting to 1.");
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }


    @Override
    public void borrowItem(String borrowerName) {
        checkOut(borrowerName);
    }

    @Override
    public void returnItem() {
        checkIn();
    }

    @Override
    public boolean isAvailable() {
        return !isCheckedOut;
    }

    @Override
    public int getBorrowingPeriod() {
        return 14;
    }

    @Override
    public String getItemInfo() {
        return super.getItemInfo() + ", Type: Book, ISBN: " + isbn + ", Genre: " + genre +
                ", Pages: " + numberOfPages;
    }
}