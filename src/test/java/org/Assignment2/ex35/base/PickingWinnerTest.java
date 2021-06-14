package org.Assignment2.ex35.base;

import org.Assignment2.ex34.base.EmployeeListRemoval;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PickingWinnerTest {

    @Test
    void pickWinner() {

        //given
        ArrayList<String> MyList = new ArrayList<String>();
        MyList.add("Bob");

        //When
        EmployeeListRemoval.DeleteEmployee(MyList, "Bob");
        int expected = 1;
        int actual = MyList.size();

        //Then
        assertEquals(expected, actual);
    }
}