package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void passwordValidator_returns1() {
        app testApp = new app();
        int output = testApp.passwordValidator("12345");
        assertEquals(1, output);
    }

    @Test
    void passwordValidator2() {
        app testApp = new app();
        int output = testApp.passwordValidator("abcdef");
        assertEquals(2, output);
    }

    @Test
    void passwordValidator3() {
        app testApp = new app();
        int output = testApp.passwordValidator("abc123xyz");
        assertEquals(3, output);
    }

    @Test
    void passwordValidator4() {
        app testApp = new app();
        int output = testApp.passwordValidator("1337h@xor!");
        assertEquals(4, output);
    }
}