public class DVD extends LibraryItem implements Borrowable {
    private int duration;
    private String rating;
    private String genre;

    public DVD(String itemId, String title, String author, int duration, String rating, String genre) {
        super(itemId, title, author);
        setDuration(duration);
        setRating(rating);
        this.genre = genre;
    }

    public int getDuration() { return duration; }
    public String getRating() { return rating; }
    public String getGenre() { return genre; }

    public void setRating(String rating) {
        String validRatings = "G, PG, PG-13, R, NC-17";
        if (validRatings.contains(rating.toUpperCase())) {
            this.rating = rating.toUpperCase();
        } else {
            System.err.println("DVD: Invalid rating: " + rating + ". Setting to 'NR'.");
            this.rating = "NR";
        }
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            System.err.println("DVD: Duration must be positive. Setting to 1 minute.");
            this.duration = 1;
        } else {
            this.duration = duration;
        }
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.00;
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
        return 5;
    }

    @Override
    public String getBorrowingStatus() {
        return "DVD: " + Borrowable.super.getBorrowingStatus();
    }

    @Override
    public String getItemInfo() {
        return super.getItemInfo() + ", Type: DVD, Duration: " + duration + " min, Rating: " + rating;
    }
}