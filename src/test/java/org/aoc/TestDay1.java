package org.aoc;

import org.aoc.day1.HistoricalLocations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1 {

    @Test
    void testPart1() {

        String test = """
                3   4
                4   3
                2   5
                1   3
                3   9
                3   3""";

        HistoricalLocations hist_locations = new HistoricalLocations();

        test.lines().forEach(hist_locations::add_line);

        assertEquals(hist_locations.distances().stream().mapToInt(Integer::intValue).sum(), 11);
    }

    @Test
    void testPart2() {

        String test = """
                3   4
                4   3
                2   5
                1   3
                3   9
                3   3""";

        HistoricalLocations hist_locations = new HistoricalLocations();

        test.lines().forEach(hist_locations::add_line);

        assertEquals(hist_locations.similarities().stream().mapToInt(Math::toIntExact).sum(), 31);
    }

}

