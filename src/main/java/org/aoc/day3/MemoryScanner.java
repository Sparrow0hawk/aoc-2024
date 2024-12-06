package org.aoc.day3;

import java.util.ArrayList;
import java.util.List;

public class MemoryScanner {
    public List<MemoryLine> lines;

    public MemoryScanner() {
        lines = new ArrayList<>();
    }

    public void addLine(String line) {
        lines.add(new MemoryLine(line));
    }
}
