package IntermediateP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie {
    int id;
    String title;
    int totalseats;
    int bookedseats;

    Movie(int id, String title, int totalseats) {
        this.id = id;
        this.title = title;
        this.totalseats = totalseats;
        this.bookedseats = 0;
    }

    public int availableseats() {
        return totalseats - bookedseats;
    }

    public void bookSeats(int count) {
        bookedseats += count;
    }

    public void cancelSeats(int count) {
        bookedseats -= count;
    }

    public String toString() {
        return "[" + id + "] " + title + " (Total: " + totalseats + ", Booked: " + bookedseats + ", Available: " + availableseats() + ")";
    }
}

class Booking {
    int bookingid;
    int bookno;
    Movie movie;

    public Booking(int bookingid, int bookno, Movie movie) {
        this.bookingid = bookingid;
        this.bookno = bookno;
        this.movie = movie;
    }

    public void printReceipt() {
        System.out.println("------ Booking Receipt ------");
        System.out.println("Booking ID: " + bookingid);
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Number of Seats: " + bookno);
        System.out.println("Total Amount: ₹" + (bookno * 150));
        System.out.println("-----------------------------");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        List<Booking> bookingList = new ArrayList<>();
        int bookingcounter = 1;

        movies.add(new Movie(1, "Jawan", 50));
        movies.add(new Movie(2, "RRR", 40));
        movies.add(new Movie(3, "Bahubali", 30));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Movie Booking System ---");
            System.out.println("1. View all movies");
            System.out.println("2. Book ticket");
            System.out.println("3. Cancel ticket");
            System.out.println("4. View all bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Movies:");
                    for (Movie m : movies) {
                        System.out.println(m);
                    }
                    break;

                case 2:
                    System.out.print("Enter movie ID to book: ");
                    int movieid = sc.nextInt();
                    Movie selectedmovie = null;
                    for (Movie m : movies) {
                        if (m.id == movieid) {
                            selectedmovie = m;
                            break;
                        }
                    }
                    if (selectedmovie == null) {
                        System.out.println("Invalid movie ID.");
                        break;
                    }

                    System.out.print("Enter number of seats: ");
                    int seats = sc.nextInt();
                    if (seats > selectedmovie.availableseats()) {
                        System.out.println("Not enough seats available.");
                        break;
                    }

                    selectedmovie.bookSeats(seats);
                    Booking newBooking = new Booking(bookingcounter++, seats, selectedmovie);
                    bookingList.add(newBooking);
                    newBooking.printReceipt();
                    break;

                case 3:
                    System.out.print("Enter Booking ID to cancel: ");
                    int cancelId = sc.nextInt();
                    Booking cancelbooking = null;
                    for (Booking b : bookingList) {
                        if (b.bookingid == cancelId) {
                            cancelbooking = b;
                            break;
                        }
                    }
                    if (cancelbooking == null) {
                        System.out.println("Booking ID not found.");
                        break;
                    }
                    cancelbooking.movie.cancelSeats(cancelbooking.bookno);
                    bookingList.remove(cancelbooking);
                    System.out.println("Booking cancelled successfully.");
                    break;

                case 4:
                    if (bookingList.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        System.out.println("All Bookings:");
                        for (Booking b : bookingList) {
                            b.printReceipt();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
