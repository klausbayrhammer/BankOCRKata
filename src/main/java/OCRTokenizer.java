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
            String digit = "";
            for (int i1 = 0; i1 < rows.length; i1++) {
                String row = rows[i1];
                if(!digit.isEmpty())
                    digit += SEPARATOR;
                digit += row.substring(i, i + 3) ;
            }
            digits.add(digit);
        }
        return digits;
    }
}
