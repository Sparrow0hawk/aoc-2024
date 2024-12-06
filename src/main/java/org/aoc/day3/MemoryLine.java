package org.aoc.day3;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class MemoryLine {
    List<Multiplier> multipliers;

    public MemoryLine() {
    }

    public void parseLine(String line) {
        Pattern mulPattern = Pattern.compile("mul\\(\\d+,\\d+\\)");
        List<String> mulStrings = mulPattern.matcher(line).results().map(MatchResult::group).toList();
        multipliers = mulStrings.stream().map(Multiplier::new).toList();
    }

    public int sum() {
        return multipliers.stream().mapToInt(m -> m.product).sum();
    }
}
