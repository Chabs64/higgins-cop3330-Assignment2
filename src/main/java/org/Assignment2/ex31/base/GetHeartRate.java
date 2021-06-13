package org.Assignment2.ex31.base;

public class GetHeartRate {

    //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

    public static int BPM(int percent, int age, int restingHR)
    {

        double BeatsPerMin = 0;
        double intensity = ((double) percent/100);

        BeatsPerMin = (((220 - age) - restingHR) * intensity) + restingHR;

        return (int) Math.round(BeatsPerMin);
    }

}
