package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void guessStatusLow() {
        app testApp = new app();
        int output = app.guessStatus(5, 4);

        assertEquals(0, output);
    }

    @Test
    void guessStatusHigh() {
        app testApp = new app();
        int output = app.guessStatus(5, 6);

        assertEquals(1, output);
    }

    @Test
    void guessStatusCorrect() {
        app testApp = new app();
        int output = app.guessStatus(5, 5);

        assertEquals(2, output);
    }
}