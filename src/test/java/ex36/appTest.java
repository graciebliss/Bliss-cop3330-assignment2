package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void min() {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(1000);

        app test=new app();

        int output=test.min(nums);

        assertEquals(100, output);

    }

    @Test
    void max() {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(1000);

        app test=new app();

        int output=test.max(nums);

        assertEquals(1000, output);
    }

    @Test
    void average() {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(1000);

        app test=new app();

        double output=test.average(nums);

        assertEquals(400.0, output);
    }

    @Test
    void std() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(1000);

        app test = new app();

        double output = test.std(nums);

        assertEquals(353.55, output);
    }
}