package org.aoc.day2;

import java.util.ArrayList;
import java.util.List;

public class SafetyReports {
    private List<SafetyReport> safetyReports;

    public SafetyReports() {
        safetyReports = new ArrayList<>();
    }

    public void addLine(String line) {
        safetyReports.add(new SafetyReport(line));
    }

    public long totalSafe() {
        return safetyReports.stream().filter(SafetyReport::isSafe).count();
    }

    public long totalSafeWithDampener() {
        return safetyReports.stream().filter(SafetyReport::isSafeWithDampener).count();
    }
}
