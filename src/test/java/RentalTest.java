import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RentalTest {

    @Test
    public void testRentalCostCalculation() {
        Movie movie = new Movie("The Matrix", "Action", 5.0);
        Customer customer = new Customer("John Doe", 30);
        Rental rental = new Rental(movie, customer, 4);

        assertEquals(20.0, rental.calculateRentalCost());
    }

    @Test
    public void testRentalDetails() {
        Movie movie = new Movie("The Matrix", "Action", 5.0);
        Customer customer = new Customer("John Doe", 30);
        Rental rental = new Rental(movie, customer, 4);

        assertEquals("John Doe rented The Matrix for 4 days.", rental.rentalDetails());
    }
}