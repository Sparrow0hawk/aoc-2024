package org.aoc.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day1.txt"));

        HistoricalLocations hist_locations = new HistoricalLocations();

        reader.lines().forEach(hist_locations::add_line);

        int result = hist_locations.distances().stream().mapToInt(Integer::intValue).sum();

        int partTwoResult = hist_locations.similarities().stream().mapToInt(Math::toIntExact).sum();

        System.out.println("Solution for day 1 part 1: " + result);
        System.out.println("Solution for day 1 part 2: " + partTwoResult);
    }
}
