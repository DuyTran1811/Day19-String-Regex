package BT2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePhoneNumberTest {
    ValidatePhoneNumber vl = new ValidatePhoneNumber();
    @Test
    @DisplayName("0902288536")
    public void check1(){
        String regex = "0902288536";
        assertTrue(vl.checkPhone(regex));
    }
    @Test
    @DisplayName("a822222222")
    public void check2(){
        String regex = "a822222222";
        assertFalse(vl.checkPhone(regex));
    }
    @Test
    @DisplayName("0123456789")
    public void check3(){
        String regex = "0923456789";
        assertTrue(vl.checkPhone(regex));
    }
}