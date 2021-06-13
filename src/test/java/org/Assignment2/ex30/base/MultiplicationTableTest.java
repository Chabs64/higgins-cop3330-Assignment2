package org.Assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void neededSomethingToTest_Not_much_point_testing_void_points() {

        //given
        int i = 6;
        int j = 4;

        //When
        int Actual = MultiplicationTable.NeededSomethingToTest(i, j);
        int Expected = 24;

        //Then
        assertEquals(Expected, Actual);
    }
}