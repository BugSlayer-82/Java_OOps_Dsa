// import java.util.HashMap;

// /* Question ===> 1 Encapsulation, Constructor, fast lookup (Map hint) */
// class Book {
//     private String bookTitle;
//     private String bookId;
//     private boolean isAvailable;
//     Book(String bookTitle, String bookId, boolean isAvailable) {
//         this.bookTitle = bookTitle;
//         this.bookId = bookId;
//         this.isAvailable = isAvailable;
//     }
//     public String getBookTittle() {
//         return bookTitle;
//     }
//     public String getBookId() {
//         return bookId;
//     }
//     public boolean getStatus() {
//         return isAvailable;
//     }
//     public String getBookDetail() {
//         return "Book ID: " + bookId + " | Title: " + bookTitle + " | Available: " + isAvailable;
//     }
// }
// class Library {
//     private String libraryName;
//     private HashMap<String, Book> books = new HashMap<>();
//     Library(String libraryName) {
//         this.libraryName = libraryName;
//     }
//     public void addBook(Book b) {
//         books.put(b.getBookId(), b);
//     }
//     public String getLibraryName() {
//         return libraryName;
//     }
//     public Book getBookWithId(String id) {
//         return books.get(id);
//     }
// }

public class Oops_dsa_5 {
    public static void main(String[] args) {

        // /* Question ===> 1 Encapsulation, Constructor, fast lookup (Map hint) */
        // Book b1 = new Book("Hulk the fighter", "H-234", true);
        // Book b2 = new Book("Stark the avenger", "S-348", true);
        // Book b3 = new Book("Strange the magician", "ST-234", true);
        // Library l = new Library("Tony's Library");
        // l.addBook(b1);
        // l.addBook(b2);
        // l.addBook(b3);
        // System.out.println("Library Name --> " + l.getLibraryName());
        // Book book = l.getBookWithId("H-234");
        // if (book != null) {
        // System.out.println(book.getBookDetail());
        // } else {
        // System.out.println("Book not available !");
        // }

    }
}