package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void isAnagramTrue() {
        app testApp = new app();
        boolean output = testApp.isAnagram("note", "tone");
        assertTrue(output);
    }

    @Test
    void isAnagramFalse() {
        app testApp = new app();
        boolean output = testApp.isAnagram("Cat", "Car");
        assertFalse(output);
    }


}