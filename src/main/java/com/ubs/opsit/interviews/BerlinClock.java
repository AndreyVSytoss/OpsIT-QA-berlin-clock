package com.ubs.opsit.interviews;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class BerlinClock implements TimeConverter {
    String convertedTime = null;
    String secondLamp = "O";
    String fiveHourLamps = "OOOO";
    String oneHourLamps = "OOOO";
    String fiveMinutesLapms = "OOOOOOOOOOO";
    String oneMinuteLamps = "OOOO";
    int sec = 0;
    int hours = 0;
    int minutes = 0;

    public String convertTime(String aTime)  {

        // get count of hours, minutes and seconds by parsing String to Date format
        try{
        Date time = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        time = sdf.parse(aTime);
        calendar.setTime(time);
        sec = calendar.get(Calendar.SECOND);
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        } catch (ParseException e) {e.printStackTrace();}

        // Exception when we get time in format "24:00:00"
        if(aTime.equals("24:00:00")) {
            hours = 24;
        }

        // get value of hours for "1 hour" indicator
        int hour = 0;
        int a = hours;
        if (a < 10) {
            a = a + 10;
        }
        String oneHours = Integer.toString(a);
        oneHours = Character.toString(oneHours.charAt(1));
        hour = Integer.parseInt(oneHours);

        // get value of minutes for "1 minute" indicator
        int min = 0;
        int b = minutes;
        if (b < 10) {
            b = b + 10;
        }
        String oneMin = Integer.toString(b);
        oneMin = Character.toString(oneMin.charAt(1));
        min = Integer.parseInt(oneMin);

        // Condition for "Seconds" lamp
        if ((sec%2) == 0) {
            secondLamp = "Y";
        }

        // Condition for "Five hours" lamps
        if (hours >= 5) {
            fiveHourLamps = "ROOO";
            if (hours >= 10) {
                fiveHourLamps = "RROO";
                if (hours >= 15) {
                    fiveHourLamps = "RRRO";
                    if (hours >= 20) {
                        fiveHourLamps = "RRRR";
                    }
                }
            }
        }

        // Condition for "One hour" lamps
        if (hour == 1) {
            oneHourLamps = "ROOO";
        }
        if (hour == 2) {
            oneHourLamps = "RROO";
        }
        if (hour == 3) {
            oneHourLamps = "RRRO";
        }
        if (hour == 4) {
            oneHourLamps = "RRRR";
        }

        // Condition for "Five minutes" lamps
        if (minutes >= 5) {
            fiveMinutesLapms = "YOOOOOOOOOO";
            if (minutes >= 10) {
                fiveMinutesLapms = "YYOOOOOOOOO";
            }
                if (minutes >= 15) {
                    fiveMinutesLapms = "YYROOOOOOOO";
                }
                    if (minutes >= 20) {
                        fiveMinutesLapms = "YYRYOOOOOOO";
                    }
                        if (minutes >= 25) {
                            fiveMinutesLapms = "YYRYYOOOOOO";
                        }
                            if (minutes >= 30) {
                                fiveMinutesLapms = "YYRYYROOOOO";
                            }
                                if (minutes >= 35) {
                                    fiveMinutesLapms = "YYRYYRYOOOO";
                                }
                                    if (minutes >= 40) {
                                        fiveMinutesLapms = "YYRYYRYYOOO";
                                    }
                                        if (minutes >= 45) {
                                            fiveMinutesLapms = "YYRYYRYYROO";
                                        }
                                            if (minutes >= 50) {
                                                fiveMinutesLapms = "YYRYYRYYRYO";
                                            }
                                                if (minutes >= 55) {
                                                    fiveMinutesLapms = "YYRYYRYYRYY";
                                                }
        }

        // Condition for "One minute" lamps
        if (min == 1 || min == 6) {
            oneMinuteLamps = "YOOO";
        }
        if (min == 2 || min == 7) {
            oneMinuteLamps = "YYOO";
        }
        if (min == 3 || min == 8) {
            oneMinuteLamps = "YYYO";
        }
        if (min == 4|| min == 9) {
            oneMinuteLamps = "YYYY";
        }

        convertedTime = secondLamp +" "+ fiveHourLamps + " " + oneHourLamps + " " + fiveMinutesLapms + " " + oneMinuteLamps;
        return convertedTime;
    }
}
