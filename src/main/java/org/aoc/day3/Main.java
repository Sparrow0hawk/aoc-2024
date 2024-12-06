package org.aoc.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day3.txt"));

        MemoryScanner memoryScanner = new MemoryScanner();

        reader.lines().forEach(memoryScanner::addLine);

        long partOneResult = memoryScanner.lines.stream().mapToInt(MemoryLine::sum).sum();

        System.out.println("Solution for day 3 part 1: " + partOneResult);
    }
}
