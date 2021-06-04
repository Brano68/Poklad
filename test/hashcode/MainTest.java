package hashcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void testHashCode() {
        assertEquals(0, main.hashCode(""));
        assertEquals(7,main.hashCode("bbb"));

        assertEquals(5,main.hashCode("bab"));
        assertEquals(15,main.hashCode("bbbb"));
    }


}