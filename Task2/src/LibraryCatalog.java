import java.util.ArrayList;

public class LibraryCatalog {
	 private ArrayList<Book> books;

	    public LibraryCatalog() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public ArrayList<Book> searchByTitle(String title) {
	        ArrayList<Book> result = new ArrayList<>();
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                result.add(book);
	            }
	        }
	        return result;
	    }

	    public ArrayList<Book> searchByAuthor(String author) {
	        ArrayList<Book> result = new ArrayList<>();
	        for (Book book : books) {
	            if (book.getAuthor().equalsIgnoreCase(author)) {
	                result.add(book);
	            }
	        }
	        return result;
	    }

	    public boolean checkOutBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
	                book.checkOut();
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean returnBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
	                book.returnBook();
	                return true;
	            }
	        }
	        return false;
	    }

	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	
}
