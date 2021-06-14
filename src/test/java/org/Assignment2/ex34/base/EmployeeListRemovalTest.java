package org.Assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {

    @Test
    void deleteEmployee_deletes() {

        //given
        ArrayList<String> MyList = new ArrayList<String>();
        MyList.add("Bob");

        //When
        EmployeeListRemoval.DeleteEmployee(MyList, "Bob");
        int expected = 0;
        int actual = MyList.size();

        //Then
        assertEquals(expected, actual);
    }
}