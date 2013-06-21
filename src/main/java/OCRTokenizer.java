import java.util.ArrayList;
import java.util.List;

/**
 * @author Klaus Bayrhammer
 */
public class OCRTokenizer {

    public static final String SEPARATOR = "\n";

    public List<String> tokenize(String accountNrWithSingleDigit) {
        String[] rows = accountNrWithSingleDigit.split("\n");
        ArrayList<String> digits = new ArrayList<String>();

        for (int i = 0; i < rows[0].length(); i+=3) {
            String digit = createDigit(rows, i);
            digits.add(digit);
        }
        return digits;
    }

    private String createDigit(String[] rows, int i) {
        String digit = "";
        for (String row : rows) {
            if (notFirstLine(digit))
                digit = appendSeparator(digit);
            digit += row.substring(i, i + 3);
        }
        return digit;
    }

    private String appendSeparator(String digit) {
        digit += SEPARATOR;
        return digit;
    }

    private boolean notFirstLine(String digit) {
        return !digit.isEmpty();
    }
}
