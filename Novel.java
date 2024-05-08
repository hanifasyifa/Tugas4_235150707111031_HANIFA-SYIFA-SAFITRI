class Novel  extends Book implements BookOperation {
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public void setGenre (String genre) {
        this.genre = genre;
    }

    public String getGenre () {
        return genre;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Genre \t\t: " + genre);
        System.out.println();
    }

    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Novel \t\t: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Novel \t\t: " + getTitle() + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel \t\t: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Novel \t\t: " + getTitle() + " is not borrowed.");
        }
    }
}
