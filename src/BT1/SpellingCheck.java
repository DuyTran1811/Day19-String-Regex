package BT1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class SpellingCheck {
    private final String SPELLING_VALIDATE = "^(C|A|P){1}\\d{4}(G|H|I|K|L|M)$";

    public SpellingCheck() {
    }

    public boolean SpellingCheck(String regex) {
        Pattern pattern = Pattern.compile(SPELLING_VALIDATE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
