package IntermediateP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Book {
	int id;
	String title;
	String author;
	boolean isIssued;
	 public Book(int id, String title, String author) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
	 }
	public void issue() {
		isIssued=true;
	}
	public void returnbook() {
		isIssued=false;
	}
	 public String getStatus() {
	        return isIssued ? "Issued" : "Available";
	 }
	@Override
	public  String toString() {
		return +id+title+"by"+author+getStatus() ;
	}


class Library{
	List<Book>books=new ArrayList<>();
	public void addbook(Book book) {
		books.add(book);
		System.out.println("book successfully added");
	}
	
	 public void searchByTitle(String title) {
	        boolean found = false;
	        for (Book book : books) {
	            if (book.title.equalsIgnoreCase(title)) {
	                System.out.println(book);
	                found = true;
	            }
	        }
	        if (!found) System.out.println("No book found with that title.");
	    }

	    public void searchByAuthor(String author) {
	        boolean found = false;
	        for (Book book : books) {
	            if (book.author.equalsIgnoreCase(author)) {
	                System.out.println(book);
	                found = true;
	            }
	        }
	        if (!found) System.out.println("No books found by that author.");
	    }

	    public void issueBook(int id) {
	        for (Book book : books) {
	            if (book.id == id) {
                if (!book.isIssued) {
                    book.issue();
	                    System.out.println("Book issued successfully.");
	                } else {
	                    System.out.println("Book is already issued.");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found.");
	    }

	    public void returnBook(int id) {
	        for (Book book : books) {
	            if (book.id == id) {
	                if (book.isIssued) {
	                    book.returnbook();
	                    System.out.println("Book returned successfully.");
	                } else {
	                    System.out.println("This book was not issued.");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found.");
	    }

	    public void displayBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books in library.");
	            return;
	        }
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	}
public class Problem1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library library=new Library();
		while(true) {
		System.out.println("Library Management Menu:");
		System.out.println("1.Add book");
		System.out.println("2.search book title");
		System.out.println("3.search book author");
		System.out.println("4.issue book");
		System.out.println("5.return book");
		System.out.println("6. show all books");
		System.out.println("7. exit");
		
		System.out.println("enter an option");
		int choice=sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println("enter book id");
			int id=sc.nextInt();
			sc.nextLine(); 
			 System.out.print("Enter Title: ");
             String title = sc.nextLine();
             System.out.print("Enter Author: ");
             String author = sc.nextLine();
			library.addbook(new Book(id,title,author));
			break;
		case 2:
			System.out.println("enter book title");
		String searchtitle=sc.nextLine();
		library.searchByTitle(searchtitle);
			break;
		case 3:
			System.out.println("enter author name");
			String searchauthor=sc.nextLine();
			library.searchByAuthor(searchauthor);
			break;
		case 4:
			System.out.println("enter bookID to issue");
			int issue=sc.nextInt();
			library.issueBook(issue);
			return;
		case 5:
			System.out.println("enter bookID to return");
			int returned=sc.nextInt();
			library.returnBook(returned);
		case 6:
			System.out.println("display");
			library.displayBooks();
			break;
		case 7:
			 System.out.println("Exiting system. Goodbye!");
             return;
         default:
             System.out.println("Invalid choice. Try again.");
     }
			}
	}
	}


