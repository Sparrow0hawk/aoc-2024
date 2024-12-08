package org.aoc.day2;

import java.util.*;

import static java.lang.Math.abs;

public class SafetyReport {
    private List<Integer> levels;
    private HashSet<Integer> acceptableChange;

    public SafetyReport(String line) {
        levels = Arrays.stream(line.split("\\s+")).map(Integer::parseInt).toList();
        acceptableChange = new HashSet<>(Arrays.asList(1, 2, 3));

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
        List<Integer> levelChanges = this.calculateChanges(levels);
        return (levelChanges.stream().allMatch(i -> i < 0) | levelChanges.stream().allMatch(i -> i > 0)) & levelChanges.stream().allMatch(i -> acceptableChange.contains(abs(i)));
    }

    public boolean isSafeWithDampener() {
        for (int i = 0; i < levels.size(); i++) {
            List<Integer> levelsAdjusted = new ArrayList<>(levels);
            levelsAdjusted.remove(i);
            List<Integer> levelsAdjustedChanges = this.calculateChanges(levelsAdjusted);
            if ((levelsAdjustedChanges.stream().allMatch(item -> item < 0) | levelsAdjustedChanges.stream().allMatch(item -> item > 0)) & levelsAdjustedChanges.stream().allMatch(item -> acceptableChange.contains(abs(item)))) {
                return true;
            }
        }
        return false;
    }
}
