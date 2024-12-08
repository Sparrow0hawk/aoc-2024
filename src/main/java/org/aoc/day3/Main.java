package org.aoc.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

public class Main {
    public static void solve() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/day3.txt"));
        String input = reader.lines().collect(Collectors.joining(""));

        MemoryScanner memoryScanner = new MemoryScanner();
        MemoryScanner memoryScannerSupportingInstructions = new MemoryScannerSupportingInstructions();

        memoryScanner.addLine(input);
        memoryScannerSupportingInstructions.addLine(input);

        long partOneResult = memoryScanner.lines.stream().mapToInt(MemoryLine::sum).sum();
        long partTwoResult = memoryScannerSupportingInstructions.lines.stream().mapToInt(MemoryLine::sum).sum();

        System.out.println("Solution for day 3 part 1: " + partOneResult);
        System.out.println("Solution for day 3 part 2: " + partTwoResult);
    }
}
