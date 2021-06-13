package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void removeEmployeeIfChris() {
        app test=new app();
        String[] employees={"John Smith","Jackie Jackson","Chris Johns","Amanda Cullen","Jeremy Goodwin"};
        String[] output=test.removeEmployee(employees, "Chris Johns");
        String[] expected={"John Smith","Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};
        assertArrayEquals(expected, output);
    }
}