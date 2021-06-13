package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void getChoiceIfZero() {
        app test=new app();
        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.getChoice(choices, 0);
        assertEquals("Yes.", output);
    }

    @Test
    void getChoiceIfOne() {
        app test=new app();
        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.getChoice(choices, 1);
        assertEquals("No.", output);
    }

    @Test
    void getChoiceIfTwo() {
        app test=new app();
        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.getChoice(choices, 2);
        assertEquals("Maybe.", output);
    }

    @Test
    void getChoiceIfThree() {
        app test=new app();
        String[] choices={"Yes.","No.","Maybe.","Ask again later."};
        String output=test.getChoice(choices, 3);
        assertEquals("Ask again later.", output);
    }
}