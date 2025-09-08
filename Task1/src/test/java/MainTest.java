import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testBsc() {
        assertEquals(4, Main.getYears("bsc"));
    }
    @Test
    void testMsc() {
        assertEquals(6, Main.getYears("msc"));
    }
    @Test
    void testPhd() {
            assertEquals(7, Main.getYears("phd"));
    }
}
