package org.aoc.day3;

import java.util.ArrayList;
import java.util.List;

public class MemoryScanner {
    public List<MemoryLine> lines;

    public MemoryScanner() {
        lines = new ArrayList<>();
    }

    public void addLine(String line) {
        MemoryLine memoryLine = new MemoryLine();
        memoryLine.parseLine(line);
        lines.add(memoryLine);
    }
}
