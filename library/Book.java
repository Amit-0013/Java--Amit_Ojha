//Create a Book class for a library system.
//• Instance variables: title, author, isbn.
//• Static variable: totalBooks, a counter for the total number of book
//instances.
//• Instance methods: borrowBook(), returnBook().
//• Static method: getTotalBooks(), to get the total number of books in the
//library
package library;

public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks;
    boolean isBorrowed;
    static{
        totalBooks = 0;
    }
  {
        totalBooks++;
  }
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String isbn){
        this(isbn , "unknown" , "unknown");
    }
    static int GetTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("The book is already borrowed.");
        }
        else{
            isBorrowed = true;
            System.out.println("Thanks for borrowing the book.");
        }
    }
    void returnBook(){
        if(isBorrowed){
            System.out.println("Thanks for returning the book.");
            isBorrowed = false;
        }
        else{
            System.out.println("Please borrow the book first.");
        }
    }

    public static void main(String[] args) {
        Book RichDad = new Book("Rich Dad" , "T.Kawasaki" , "101");
        Book AtomicHabits = new Book("102");
        Book Java = new Book("SunLabs" , "Oracle" , "103");
        RichDad.borrowBook();
        RichDad.borrowBook();
        RichDad.returnBook();
        AtomicHabits.borrowBook();
        System.out.println(Book.GetTotalBooks());
    }
}
