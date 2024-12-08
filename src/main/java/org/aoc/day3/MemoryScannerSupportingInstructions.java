package org.aoc.day3;

public class MemoryScannerSupportingInstructions extends MemoryScanner {
    @Override
    public void addLine(String line) {
        MemoryLine memoryLine = new MemoryLineWithInstructions();
        memoryLine.parseLine(line);
        lines.add(memoryLine);
    }
}
