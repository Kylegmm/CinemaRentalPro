import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("John Doe", 30);
        assertEquals("John Doe", customer.getName());
        assertEquals(30, customer.getAge());
    }
}