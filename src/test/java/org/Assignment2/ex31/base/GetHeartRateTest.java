package org.Assignment2.ex31.base;

import org.Assignment2.ex30.base.MultiplicationTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetHeartRateTest {

    @Test
    void BPM_test_value() {

        //given
        int percent = 55;
        int age = 22;
        int restingHR = 65;


        //When
        int Actual = GetHeartRate.BPM(percent, age, restingHR);
        int Expected = 138;

        //Then
        assertEquals(Expected, Actual);
    }
}