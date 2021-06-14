package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void isNameValidTrue() {
        app testApp = new app();
        boolean output = testApp.isNameValid("Jose");
        assertTrue(output);
    }

    @Test
    void isNameValidFalse() {
        app testApp = new app();
        boolean output = testApp.isNameValid("J");
        assertFalse(output);
    }

    @Test
    void isNameValidEmpty() {
        app testApp = new app();
        boolean output = testApp.isNameValid("");
        assertFalse(output);
    }

    @Test
    void isZipCodeValidValid() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("12345");
        assertTrue(output);
    }

    @Test
    void isZipCodeValidInvalid() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("asc12");
        assertFalse(output);
    }

    @Test
    void isZipCodeValidInvalid2() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("123456");
        assertFalse(output);
    }

    @Test
    void isZipCodeValidEmpty() {
        app testApp = new app();
        boolean output = testApp.isZipCodeValid("");
        assertFalse(output);
    }


    @Test
    void isEmployeeIdValidTrue() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("ab-1234");
        assertTrue(output);
    }

    @Test
    void isEmployeeIdValidFalse() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("ab12-1234asd");
        assertFalse(output);
    }

    @Test
    void isEmployeeIdValidEmpty() {
        app testApp = new app();
        boolean output = testApp.isEmployeeIdValid("");
        assertFalse(output);
    }
}