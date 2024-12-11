package hashMap;

public class LibraryUserTest {
    public static void main(String[] args) {
        LibraryUser libuser = new LibraryUser();

        libuser.addBorrowedBook("B101", "1984, 01/01/2024, 01/15/2024");
        libuser.addBorrowedBook("B102", "Pride and Prejudice, 01/05/2024, 01/20/2024");
        libuser.addBorrowedBook("B103", "Moby Dick, 01/10/2024, 01/25/2024");

        System.out.println("\n---Borrowed Books---\n");
        libuser.displayAllBorrowedBooks();

        libuser.removeBorrowedBook("B101");

        System.out.println("\n---Updated Borrowed Books---\n");
        libuser.displayAllBorrowedBooks();

    }
}
