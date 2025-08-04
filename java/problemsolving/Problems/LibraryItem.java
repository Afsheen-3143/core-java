package problemsolving;

import java.util.List;
import java.util.ArrayList;
import java.util.List;


	
	// Base class
	class MediaItem {
	    String title;

	    public MediaItem(String title) {
	        this.title = title;
	    }

	    @Override
	    public String toString() {
	        return "Title: " + title;
	    }
	}

	// Subclass: Book
	class Book extends MediaItem {
	    public Book(String title) {
	        super(title);
	    }
	}

	// Subclass: Magazine
	class Magazine extends MediaItem {
	    public Magazine(String title) {
	        super(title);
	    }
	}

	public class LibraryItem {

	    // Print any list of MediaItem or its subclasses
	    public static void printItems(List<? extends MediaItem> items) {
	        for (MediaItem item : items) {
	            System.out.println(item);
	        }
	    }

	    // Add a book to any list of MediaItem or its superclasses
	    public static void addBookToLibrary(List<? super Book> list) {
	        list.add(new Book("Java Programming"));
	    }

	    public static void main(String[] args) {
	        // List of books
	        List<Book> books = new ArrayList<>();
	        books.add(new Book("Clean Code"));
	        books.add(new Book("Effective Java"));

	        // List of magazines
	        List<Magazine> magazines = new ArrayList<>();
	        magazines.add(new Magazine("National Geographic"));
	        magazines.add(new Magazine("Time"));

	        // Print books
	        System.out.println("Books:");
	        printItems(books); // works because List<Book> is a subtype of List<? extends MediaItem>

	        // Print magazines
	        System.out.println("\nMagazines:");
	        printItems(magazines); // works for the same reason

	        // List that accepts any MediaItem or Book
	        List<MediaItem> libraryShelf = new ArrayList<>();
	        addBookToLibrary(libraryShelf);  // allowed because it's List<? super Book>
	        System.out.println("\nLibrary Shelf After Adding Book:");
	        printItems(libraryShelf);
	    }
	}
