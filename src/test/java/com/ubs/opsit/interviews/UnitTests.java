package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTests {
    BerlinClock berlinClock;

    @Before
    public void initBerlinClock(){
        berlinClock = new BerlinClock();
    }

    @Test
    public void example1Tests() throws Exception {
        String actual = berlinClock.convertTime("00:00:00");
        String expected = "Y OOOO OOOO OOOOOOOOOOO OOOO";
        assertEquals(expected, actual);
    }

    @Test
    public void example2Tests() throws Exception {
        String actual = berlinClock.convertTime("13:17:01");
        String expected = "O RROO RRRO YYROOOOOOOO YYOO";
        assertEquals(expected, actual);
    }

    @Test
    public void example3Tests() throws Exception {
        String actual = berlinClock.convertTime("23:59:59");
        String expected = "O RRRR RRRO YYRYYRYYRYY YYYY";
        assertEquals(expected, actual);
    }

    @Test
    public void example4Tests() throws Exception {
        String actual = berlinClock.convertTime("24:00:00");
        String expected = "Y RRRR RRRR OOOOOOOOOOO OOOO";
        assertEquals(expected, actual);
    }

}
