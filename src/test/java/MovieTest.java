import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    public void testMovieCreation() {
        Movie movie = new Movie("The Matrix", "Action", 5.0);
        assertEquals("The Matrix", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(5.0, movie.getPricePerDay());
    }
}