package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void getMonths() {
        PaymentCalculator test=new PaymentCalculator();

        int output=test.getMonths(5000, .01,100, .12/365, .12,.12/365);
        assertEquals(70, output);
    }
}