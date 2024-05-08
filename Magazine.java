class Magazine extends Book implements BookOperation{
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public String getCategory () {
        return category;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Category\t: " + category);
        System.out.println();
    }

    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine \t: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine \t: " + getTitle() + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine \t: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Magazine \t: " + getTitle() + " is not borrowed.");
        }
    }
}
