import java.util.List;

/**
 * @author Klaus Bayrhammer
 */
public class OCR {
    public String parse(String sevenSegmentAccountNr) {
        List<String> digits = tokenzieDigits(sevenSegmentAccountNr);
        return parseDigits(digits);
    }

    private List<String> tokenzieDigits(String sevenSegmentAccountNr) {
        OCRTokenizer ocrTokenizer = new OCRTokenizer();
        return ocrTokenizer.tokenize(sevenSegmentAccountNr);
    }

    private String parseDigits(List<String> digits) {
        String parsedAccountNr = "";
        for (String digit : digits) {
            parsedAccountNr += DigitLookup.lookup(digit);
        }
        return parsedAccountNr;
    }
}
