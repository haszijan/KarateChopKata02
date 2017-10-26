import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarateChopTest {
    int[] array = {1, 2, 3, 4, 5};
    @Test
    void chop() {
        KarateChop chop = new KarateChop();
        assertEquals(1, chop.chop(1, array));
        assertEquals(2, chop.chop(2, array));
        assertEquals(3, chop.chop(3, array));
        assertEquals(4, chop.chop(4, array));
        assertEquals(5, chop.chop(5, array));
    }

}