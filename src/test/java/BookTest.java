import org.example.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private Book book1,book2;
    @BeforeEach
    void setUp() {
        book1 = new Book("B001", "Effective Java", "Joshua Bloch");

        book2 = new Book("B002", "Clean Code", "Robert C. Martin");
    }
    @Test
    void TestmarkAsUnavailable(){
        assertFalse(book1.isAvailable());

    }
    @Test
    void TestmarkAsAvailable(){
        assertTrue(book2.isAvailable());
    }

}
