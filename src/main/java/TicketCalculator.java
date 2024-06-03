
// Import scanner
import java.util.Scanner;

public class TicketCalculator {
  public static void main(String[] args) {

    // Create a scanner object
    Scanner scan = new Scanner(System.in);

    // Prompt the user to enter his/her age
    System.out.println("please enter your age: ");
    int age = scan.nextInt();

    // The normal price of a ticket
    int ticketPrice = 10;

    // Calculate the discounted price
    if (age <= 12) {
      // Apply discount of 3
      ticketPrice = ticketPrice - 3;
    } else if (age >= 65) {
      // Apply discount of 5
      ticketPrice = ticketPrice - 3;
    } else {
      // No discount
      ticketPrice = ticketPrice;
    }

    // Display the discounted price
    System.out.println("Please your ticket price is: " + ticketPrice);

    // Close the scanner
    scan.close();

  }
  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}