import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Klaus Bayrhammer
 */
public class AccountNumberParserTest {
        private static final String ACCOUNT_NR_ONE_TO_NINE =
                "    _  _     _  _  _  _  _ \n"+
                "  | _| _||_||_ |_   ||_||_|\n"+
                "  ||_  _|  | _||_|  ||_| _| ";

    public static final String ACCOUNT_NR_ALL_ZEROS =
                    " _  _  _  _  _  _  _  _  _ \n" +
                    "| || || || || || || || || |\n" +
                    "|_||_||_||_||_||_||_||_||_|";

    public static final String ACCOUNT_NR_ALL_TWOS =
            " _  _  _  _  _  _  _  _  _ \n" +
            " _| _| _| _| _| _| _| _| _|\n" +
            "|_ |_ |_ |_ |_ |_ |_ |_ |_ ";

    @Test
    public void readAccountNumbersOneToNine() throws Exception {
        OCR parser = new OCR();

        assertEquals(parser.parse(ACCOUNT_NR_ONE_TO_NINE), "123456789");
    }

    @Test
    public void readAccountNumberAllZeros() throws Exception {
        OCR parser = new OCR();

        assertEquals(parser.parse(ACCOUNT_NR_ALL_ZEROS), "000000000");
    }

    @Test
    public void readAccountNumberAllTwos() throws Exception {
        OCR parser = new OCR();

        assertEquals(parser.parse(ACCOUNT_NR_ALL_TWOS), "222222222");
    }
}
