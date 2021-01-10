package TH1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailExampleTest {
    EmailExample emailExample = new EmailExample();

    @Test
    @DisplayName("a@coderym.vn")
    public void checkEmail1() {
        String regex = "a@codegrym.vn";
        assertTrue(emailExample.checkEmail(regex));
    }

    @Test
    @DisplayName("ab@yahoo.com")
    public void checkEmail2() {
        String regex = "ab@yahoo.com";
        assertTrue(emailExample.checkEmail(regex));
    }

    @Test
    @DisplayName("abc@hotmail.com")
    public void checkEmail3() {
        String regex = "abc@hotmail.com";
        assertTrue(emailExample.checkEmail(regex));
    }

    @Test
    @DisplayName("@gmail.com")
    public void checkEmail4() {
        String regex = "@gmail.com";
        assertFalse(emailExample.checkEmail(regex));
    }
    @Test
    @DisplayName("ab@gmail.")
    public void checkEmail5(){
        String regex = "ab@gmail.";
        assertFalse(emailExample.checkEmail(regex));
    }
    @Test
    @DisplayName("@#abc@gmail.com")
    public void checkEmail6(){
        String regex = "@#abc@gmail.com";
        assertFalse(emailExample.checkEmail(regex));
    }
}