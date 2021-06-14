package org.Assignment2.ex36.base;

import org.Assignment2.ex34.base.EmployeeListRemoval;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void minimum_get_min() {

        //given
        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(1);
        MyList.add(2);

        //When
        int expected = 1;
        int actual = ComputingStatistics.minimum(MyList);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void maximum_get_largestNumber() {
        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(1);
        MyList.add(2);

        //When
        int expected = 2;
        int actual = ComputingStatistics.maximum(MyList);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void average_returns_a_mean() {
        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(1);
        MyList.add(2);
        MyList.add(3);

        //When
        double expected = 2;
        double actual = ComputingStatistics.average(MyList);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void std_of_not_a_population() {
        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(1);
        MyList.add(2);

        //When
        double expected = 0.5;
        double actual = ComputingStatistics.std(MyList);

        //Then
        assertEquals(expected, actual);
    }
}