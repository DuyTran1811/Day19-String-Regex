package BT2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private final String PHONE_CHECK = "^(03|05|07|08|09)+([0-9]{8})$";

    public ValidatePhoneNumber() {
    }

    public boolean checkPhone(String inputRegex) {
        Pattern pattern = Pattern.compile(PHONE_CHECK);
        Matcher matcher = pattern.matcher(inputRegex);
        return matcher.matches();
    }
}
