package org.aoc;

import org.aoc.day2.SafetyReports;
import org.aoc.day3.MemoryLine;
import org.aoc.day3.MemoryScanner;
import org.aoc.day3.Multiplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay3 {

    @Test
    void testPart1() {

        String test = """
                xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))""";

        MemoryScanner memoryScanner = new MemoryScanner();

        test.lines().forEach(memoryScanner::addLine);

        assertEquals(161, memoryScanner.lines.stream().mapToInt(MemoryLine::sum).sum());
    }

    @Test
    void testMemoryLine() {
        String line = "zmul(2,10) mul(1,3)";
        MemoryLine memoryLine = new MemoryLine();
        memoryLine.parseLine(line);

        assertEquals(23, memoryLine.sum());
    }

    @Test
    void testMultiplier() {
        String line = "mul(2,10)";
        Multiplier multiplier = new Multiplier(line);

        assertEquals(20, multiplier.product);
    }
}

