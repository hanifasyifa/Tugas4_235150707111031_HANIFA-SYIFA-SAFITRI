 class TextBook extends Book implements BookOperation {
    private String subject;

    public TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public void setSubject (String subject) {
        this.subject = subject;
    }

    public String getSubject () {
        return subject;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Subject \t: " + subject);
        System.out.println();
    }

    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Textbook \t: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Textbook \t:" + getTitle() + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Textbook \t: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Textbook \t: " + getTitle() + " is not borrowed.");
        }
    }
}

