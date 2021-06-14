package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void calculateTargetRate() {
        app testApp = new app();
        int output = app.calculateTargetRate(22, 65, .55);

        assertEquals(138, output);
    }

    @Test
    void calculateTargetRate2() {
        app testApp = new app();
        int output = app.calculateTargetRate(22, 65, .75);

        assertEquals(164, output);
    }

    @Test
    void calculateTargetRate3() {
        app testApp = new app();
        int output = app.calculateTargetRate(22, 65, .95);

        assertEquals(191, output);
    }
}