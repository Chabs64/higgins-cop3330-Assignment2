package org.Assignment2.ex32.base;

import org.Assignment2.ex31.base.GetHeartRate;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {

    @Test
    void takeAGuess_returns_true_forMatches() {

        //inputSteam = 55??? Going to need help with this one
        //int answer = 55;


        //When
        //boolean Actual = GuessNumberGame.takeAGuess(answer);
        //boolean Expected = true;

        //Then
        //assertEquals(Expected, Actual);
    }

    @Test
    void highOrLow_knows_if_high() {

        int guess = 55;
        int answer = 54;

        //When
        int Actual = GuessNumberGame.HighOrLow(guess, answer);
        int Expected = 1;

        //Then
        assertEquals(Expected, Actual);
    }
}