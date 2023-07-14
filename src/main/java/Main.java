
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

  public static void main(String[] args) {
    String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

    //String result = new RentalInfo().statement(new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1))));
String result = new RentalInfo().statement(new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), 
        new MovieRental("F002", 1))));
assert result.equals(expected) : "Expected: " + System.lineSeparator() + expected + System.lineSeparator() 
        + System.lineSeparator() + "Got: " + System.lineSeparator() + result;

    if (!result.equals(expected)) {
      throw new AssertionError("Expected: " + System.lineSeparator() + String.format(expected) 
              + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result);
    }

   // System.out.println("Success");
   System.out.println("Tests passed successfully");

  }
}
