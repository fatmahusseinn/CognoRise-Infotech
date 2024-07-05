
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		LibraryCatalog catalog = new LibraryCatalog();

        // Add some books to the catalog
        catalog.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        catalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        catalog.addBook(new Book("1984", "George Orwell"));
        catalog.addBook(new Book("Pride and Prejudice", "Jane Austen"));

        // Display all books
        System.out.println("All books in the catalog:");
        catalog.displayBooks();

        // Search for books by title
        System.out.println("\nSearch results for title '1984':");
        ArrayList<Book> searchResults = catalog.searchByTitle("1984");
        for (Book book : searchResults) {
            System.out.println(book);
        }

        // Search for books by author
        System.out.println("\nSearch results for author 'Harper Lee':");
        searchResults = catalog.searchByAuthor("Harper Lee");
        for (Book book : searchResults) {
            System.out.println(book);
        }

        // Check out a book
        System.out.println("\nChecking out '1984':");
        if (catalog.checkOutBook("1984")) {
            System.out.println("Checked out successfully!");
        } else {
            System.out.println("Book not available.");
        }

        // Try to check out the same book again
        System.out.println("\nTrying to check out '1984' again:");
        if (catalog.checkOutBook("1984")) {
            System.out.println("Checked out successfully!");
        } else {
            System.out.println("Book not available.");
        }

        // Return the book
        System.out.println("\nReturning '1984':");
        if (catalog.returnBook("1984")) {
            System.out.println("Returned successfully!");
        } else {
            System.out.println("Book was not checked out.");
        }

        // Display all books again
        System.out.println("\nAll books in the catalog after operations:");
        catalog.displayBooks();
		
	}

}
