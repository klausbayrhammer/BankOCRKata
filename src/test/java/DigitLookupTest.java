import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Klaus Bayrhammer
 */
public class DigitLookupTest {

    @Test
    public void resolveOne() throws Exception {
        assertEquals(1, DigitLookup.lookup(DigitLookup.DIGIT_ONE));
    }

    @Test
    public void resolveTwo() throws Exception {
        assertEquals(2, DigitLookup.lookup(DigitLookup.DIGIT_TWO));
    }

    @Test
    public void resolveThree() throws Exception {
        assertEquals(3, DigitLookup.lookup(DigitLookup.DIGIT_THREE));
    }

    @Test
    public void resolveFour() throws Exception {
        assertEquals(4, DigitLookup.lookup(DigitLookup.DIGIT_FOUR));
    }

    @Test
    public void resolveFive() throws Exception {
        assertEquals(5, DigitLookup.lookup(DigitLookup.DIGIT_FIVE));
    }

    @Test
    public void resolveSix() throws Exception {
        assertEquals(6, DigitLookup.lookup(DigitLookup.DIGIT_SIX));
    }

    @Test
    public void resolveSeven() throws Exception {
        assertEquals(7, DigitLookup.lookup(DigitLookup.DIGIT_SEVEN));
    }

    @Test
    public void resolveEight() throws Exception {
        assertEquals(8, DigitLookup.lookup(DigitLookup.DIGIT_EIGHT));
    }

    @Test
    public void resolveNine() throws Exception {
        assertEquals(9, DigitLookup.lookup(DigitLookup.DIGIT_NINE));
    }

    @Test
    public void resolveZero() throws Exception {
        assertEquals(0, DigitLookup.lookup(DigitLookup.DIGIT_ZERO));
    }
}
