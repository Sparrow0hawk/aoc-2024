package org.aoc.day2;

import java.util.*;

import static java.lang.Math.abs;

public class SafetyReport {
    private List<Integer> levelChanges;

    public SafetyReport(String line) {
        List<Integer> levels = Arrays.stream(line.split("\\s+")).map(Integer::parseInt).toList();

        List<Integer> changes = new ArrayList<>();
        for (int i = 0; i < levels.size(); i++) {
            if (i + 1 < levels.size()) {
                changes.add(levels.get(i) - levels.get(i + 1));
            }
        }
        levelChanges = changes;
    }

    public boolean isSafe() {
        HashSet<Integer> acceptable_change = new HashSet<>(Arrays.asList(1, 2, 3));
        return (levelChanges.stream().allMatch(i -> i < 0) | levelChanges.stream().allMatch(i -> i > 0)) & levelChanges.stream().allMatch(i -> acceptable_change.contains(abs(i)));
    }
}
