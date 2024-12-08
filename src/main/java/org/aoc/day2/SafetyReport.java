package org.aoc.day2;

import java.util.*;

import static java.lang.Math.abs;

public class SafetyReport {
    private List<Integer> levels;

    public SafetyReport(String line) {
        levels = Arrays.stream(line.split("\\s+")).map(Integer::parseInt).toList();
    }

    private List<Integer> calculateChanges(List<Integer> levels) {
        List<Integer> changes = new ArrayList<>();
        for (int i = 0; i < levels.size(); i++) {
            if (i + 1 < levels.size()) {
                changes.add(levels.get(i) - levels.get(i + 1));
            }
        }
        return changes;
    }

    public boolean isSafe() {
        HashSet<Integer> acceptable_change = new HashSet<>(Arrays.asList(1, 2, 3));
        List<Integer> levelChanges = this.calculateChanges(levels);
        return (levelChanges.stream().allMatch(i -> i < 0) | levelChanges.stream().allMatch(i -> i > 0)) & levelChanges.stream().allMatch(i -> acceptable_change.contains(abs(i)));
    }
}
