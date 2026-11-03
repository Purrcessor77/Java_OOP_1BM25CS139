import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) { super(message); }
}

class Reservation {
    private final boolean[] seats;
    private final int totalSeats;

    public Reservation(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats + 1];
    }

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException, IllegalArgumentException {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            throw new IllegalArgumentException("Invalid seat number! Choose between 1 and " + totalSeats + ".");
        }
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked!");
        }
        
        // Shortened logic execution
        seats[seatNumber] = true;
        System.out.println("Success: Seat " + seatNumber + " has been reserved.");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Reservation system = new Reservation(10);
        System.out.println("=== RAILWAY RESERVATION SYSTEM ===");

        // Automatically manages and closes the scanner resource
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter seat number to reserve (1-10): ");
            system.reserveSeat(scanner.nextInt());
        } 
        // Handles input type errors
        catch (InputMismatchException e) {
            System.err.println("Error: Invalid input type. Please enter a numerical seat number.");
        } 
        // Shortened using Multi-Catch for identical exception behaviors
        catch (IllegalArgumentException | SeatAlreadyBookedException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n[Transaction Status]: Reservation attempt process completed.");
    }
}
