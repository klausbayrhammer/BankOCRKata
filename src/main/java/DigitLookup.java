import java.util.HashMap;
import java.util.Map;

/**
 * @author Klaus Bayrhammer
 */
public class DigitLookup {
    static final String DIGIT_ONE =
            "   \n" +
            "  |\n" +
            "  |";
    static final String DIGIT_TWO =
            " _ \n" +
            " _|\n" +
            "|_ ";
    public static final String DIGIT_THREE =
            " _ \n" +
            " _|\n" +
            " _|";
    public static final String DIGIT_FOUR =
            "   \n" +
            "|_|\n" +
            "  |";
    public static final String DIGIT_FIVE =
            " _ \n" +
            "|_ \n" +
            " _|";
    public static final String DIGIT_SIX  =
            " _ \n" +
            "|_ \n" +
            "|_|";
    public static final String DIGIT_SEVEN =
            " _ \n" +
            "  |\n" +
            "  |";
    public static final String DIGIT_EIGHT =
            " _ \n" +
            "|_|\n" +
            "|_|";
    public static final String DIGIT_NINE =
            " _ \n" +
            "|_|\n" +
            " _|";
    public static final String DIGIT_ZERO =
            " _ \n" +
            "| |\n" +
            "|_|";

    private static Map<String, Integer> DIGIT_LOOKUP = new HashMap<String, Integer>();

    static {
        DIGIT_LOOKUP.put(DIGIT_ONE, 1);
        DIGIT_LOOKUP.put(DIGIT_TWO, 2);
        DIGIT_LOOKUP.put(DIGIT_THREE, 3);
        DIGIT_LOOKUP.put(DIGIT_FOUR, 4);
        DIGIT_LOOKUP.put(DIGIT_FIVE, 5);
        DIGIT_LOOKUP.put(DIGIT_SIX, 6);
        DIGIT_LOOKUP.put(DIGIT_SEVEN, 7);
        DIGIT_LOOKUP.put(DIGIT_EIGHT, 8);
        DIGIT_LOOKUP.put(DIGIT_NINE, 9);
        DIGIT_LOOKUP.put(DIGIT_ZERO, 0);
    }

    public static int lookup(String digit) {
        return DIGIT_LOOKUP.get(digit);
    }
}
