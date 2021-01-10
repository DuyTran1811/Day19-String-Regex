package BT1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class SpellingCheckTest {
    SpellingCheck spellingCheck = new SpellingCheck();

    @Test
    @DisplayName("C0318G")
    public void check1() {
        String regex = "C0318G";
        assertTrue(spellingCheck.SpellingCheck(regex));
    }

    @Test
    @DisplayName("M0318G")
    public void check2() {
        String regex = "M0318G";
        assertFalse(spellingCheck.SpellingCheck(regex));
    }
    @Test
    @DisplayName("P0323A")
    public void check3() {
        String regex = "P0323A";
        assertFalse(spellingCheck.SpellingCheck(regex));
    }
}