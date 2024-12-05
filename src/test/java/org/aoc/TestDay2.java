package org.aoc;

import org.aoc.day2.SafetyReports;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay2 {

    @Test
    void testPart1() {

        String test = """
                7 6 4 2 1
                1 2 7 8 9
                9 7 6 2 1
                1 3 2 4 5
                8 6 4 4 1
                1 3 6 7 9""";

        SafetyReports safetyReports = new SafetyReports();

        test.lines().forEach(safetyReports::addLine);

        assertEquals(2, safetyReports.totalSafe());
    }
}

