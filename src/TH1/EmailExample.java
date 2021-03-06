package TH1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z]+(\\.[A-Za-z0-9]+$)";

    public boolean checkEmail(String inputRegex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(inputRegex);
        return matcher.matches();
    }
}
