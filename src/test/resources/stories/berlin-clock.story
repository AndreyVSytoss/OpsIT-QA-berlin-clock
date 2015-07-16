Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase the number of ways that I can read the time

//TODO - write at least a few acceptance tests

Scenario:  Acceptense Test 1

Given an Berlin Clock1
Then the resulting time from Example1 00:00:00 should be Y OOOO OOOO OOOOOOOOOOO OOOO

Scenario:  Acceptense Test 2

Given an Berlin Clock2
Then the resulting time from Example2 13:17:01 should be O RROO RRRO YYROOOOOOOO YYOO

Scenario:  Acceptense Test 3

Given an Berlin Clock3
Then the resulting time from Example3 23:59:59 should be O RRRR RRRO YYRYYRYYRYY YYYY

Scenario:  Acceptense Test 4

Given an Berlin Clock4
Then the resulting time from Example4 24:00:00 should be Y RRRR RRRR OOOOOOOOOOO OOOO