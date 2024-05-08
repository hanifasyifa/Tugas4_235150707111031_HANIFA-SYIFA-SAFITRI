public class Main {
    public static void main(String[] args) {

        // Input Informasi Buku
        TextBook textbook1 = new TextBook("Java Programming", "John Smith", 2020, "Computer Science");
        Novel novel1 = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2021, "Science");

        TextBook textbook2 = new TextBook("Head & Neck Anatomy", "James L. Hiatt & Leslie P. Gartner", 2010, "Anatomy");
        Novel novel2 = new Novel ("Bridgerton", "Julia Quinn", 2000, "Fiction");
        Magazine magazine2 = new Magazine("Bon Appetit", "Dawn Davis", 1956, "Food & Cooking");

        // Informasi Buku
        System.out.println("---- Book Information ----");
            textbook1.displayData();
            novel1.displayData();
            magazine1.displayData();

            textbook2.displayData();
            novel2.displayData();
            magazine2.displayData();

        // Status Peminjaman dan Pengembalian
        System.out.println("---- Borrowing and Returning Books ----");
            textbook1.borrowBook();  //Textbook telah dipinjam dan berhasil dikembalikan
            magazine1.borrowBook();  // Magazine telah dipinjam, namun tidak dikembalikan
            textbook1.returnBook();  //Textbook berhasil dikembalikan
            novel1.returnBook();     // Novel tidak dipinjam, namun dikembalikan
   
            novel2.borrowBook();
            magazine2.borrowBook();
            novel2.borrowBook();
            textbook2.returnBook();
            magazine2.returnBook();

    }
    
}
