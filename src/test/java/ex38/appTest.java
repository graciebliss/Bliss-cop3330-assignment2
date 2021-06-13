package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void filterEvenNumbers() {
        app test=new app();
        int[] array={1,2,3,4,5,6,7,8};

        int[] output=test.filterEvenNumbers(array);

        int[] expected={2,4,6,8};

        assertArrayEquals(expected, output);
    }
}