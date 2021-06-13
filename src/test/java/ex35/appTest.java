package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void getPerson() {
        app test=new app();

        ArrayList<String> people=new ArrayList<String>();
        people.add("Homer");
        people.add("Lisa");
        people.add("Maggie");

        String output=test.getPerson(people, 0);
        assertEquals(output, "Homer");


    }
}