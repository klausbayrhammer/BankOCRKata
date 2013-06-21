import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * @author Klaus Bayrhammer
 */
public class OCRTokenizerTest {
    private static final String ACCOUNT_NR_WITH_SINGLE_DIGIT =
            "   \n" +
            "  |\n" +
            "  |";

    private static final String ACCOUNT_NR_WITH_TWO_DIGITS =
            "      \n"+
            "  |  |\n"+
            "  |  |";
    @Test
    public void splitAccountNumberWithSingleNumber() throws Exception {
        List<String> digits = new OCRTokenizer().tokenize(ACCOUNT_NR_WITH_SINGLE_DIGIT);
        assertEquals(digits.size(), 1);
        assertEquals(digits.get(0), ACCOUNT_NR_WITH_SINGLE_DIGIT);
    }
    @Test
    public void splitAccountNumberWithTwoNumbers() throws Exception {
        List<String> digits = new OCRTokenizer().tokenize(ACCOUNT_NR_WITH_TWO_DIGITS);
        assertEquals(digits.size(), 2);
        assertEquals(digits.get(0), ACCOUNT_NR_WITH_SINGLE_DIGIT);
        assertEquals(digits.get(1), ACCOUNT_NR_WITH_SINGLE_DIGIT);
    }

    // TODO error handling ..

}
