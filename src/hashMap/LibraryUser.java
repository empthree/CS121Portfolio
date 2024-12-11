package hashMap;

import java.util.HashMap;

public class LibraryUser {
    private String userName;
    private String userID;
    private String membershipType;
    private HashMap<String,String> borrowedBooks;

    public LibraryUser(){
        borrowedBooks = new HashMap<>();
    }
    public void addBorrowedBook(String bookID, String details){
        borrowedBooks.put(bookID, details);
    }
    public void removeBorrowedBook(String bookID){
        borrowedBooks.remove(bookID);
    }
    public String getBorrowedBookDetails(String bookID){
        return borrowedBooks.get(bookID);
    }
    public void displayAllBorrowedBooks(){
        borrowedBooks.forEach((bookID, details) ->
                System.out.printf("Book ID: %s \nBook Details: %s\n", bookID, details));
    }
}
