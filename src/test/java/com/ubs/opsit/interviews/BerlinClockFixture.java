package com.ubs.opsit.interviews;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.junit.Assert.assertEquals;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class BerlinClockFixture {
    private BerlinClock clock;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }
    //TODO

    @Test
    @Given("an Berlin Clock1")
    public void initClock1(){
        clock = new BerlinClock();
    }

    @Then("the resulting time from Example1 $time should be $expected")
    public void theTimeShouldBeEx1(String time, String expected) {
        String actual = clock.convertTime(time);
        assertEquals(expected, actual);
    }

    @Test
    @Given("an Berlin Clock2")
    public void initClock2(){
        clock = new BerlinClock();
    }

    @Then("the resulting time from Example2 $time should be $expected")
    public void theTimeShouldBeEx2(String time, String expected) {
        String actual = clock.convertTime(time);
        assertEquals(expected, actual);
    }

    @Test
    @Given("an Berlin Clock3")
    public void initClock3(){
        clock = new BerlinClock();
    }

    @Then("the resulting time from Example3 $time should be $expected")
    public void theTimeShouldBeEx3(String time, String expected) {
        String actual = clock.convertTime(time);
        assertEquals(expected, actual);
    }

    @Test
    @Given("an Berlin Clock4")
    public void initClock4(){
        clock = new BerlinClock();
    }

    @Then("the resulting time from Example4 $time should be $expected")
    public void theTimeShouldBeEx4(String time, String expected) {
        String actual = clock.convertTime(time);
        assertEquals(expected, actual);
    }
    }
