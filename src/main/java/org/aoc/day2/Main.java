package org.aoc.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day2.txt"));

        SafetyReports safetyReports = new SafetyReports();

        reader.lines().forEach(safetyReports::add_line);

        long partOneResult = safetyReports.total_safe();

        System.out.println("Solution for day 2 part 1: " + partOneResult);
    }
}
