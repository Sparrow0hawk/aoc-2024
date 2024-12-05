package org.aoc.day2;

import java.util.ArrayList;
import java.util.List;

public class SafetyReports {
    private List<SafetyReport> safetyReports;

    public SafetyReports() {
        safetyReports = new ArrayList<>();
    }

    public void add_line(String line) {
        safetyReports.add(new SafetyReport(line));
    }

    public long total_safe() {
        return safetyReports.stream().filter(SafetyReport::is_safe).count();
    }
}
