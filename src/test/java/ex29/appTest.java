package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void calculateYears() {
        app testApp = new app();
        double output = app.calculateYears(4);

        assertEquals(18.0, output);
    }

    @Test
    void calculateYears2() {
        app testApp = new app();
        double output = app.calculateYears(5);

        assertEquals(14.4, output);
    }
}