package com.ubs.opsit.interviews;

import java.text.ParseException;

public class Test {
    public static void main (String[] args) throws ParseException {
        BerlinClock clock = new BerlinClock();
        String time = clock.convertTime("01:02:03");
        System.out.print(time);
    }
}
