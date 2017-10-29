import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarateChopTest {
    int[] array = {1, 3, 5};
    @Test
    void chop() {
        KarateChop chop = new KarateChop();

        assertEquals(0, chop.chop(1, array));
        assertEquals(1, chop.chop(3, array));
        assertEquals(2, chop.chop(5, array));
        assertNotEquals(0, chop.chop(0, array));
        assertNotEquals(2, chop.chop(2, array));
        assertEquals(50, chop.chop(50, maxValue(10000)));
    }

    private int[] maxValue(int highestValue) {
        int[] result = new int[highestValue];
        for (int i = 0; i < highestValue; i++) {
            result[i] = i;
        }
        return result;
    }
}