package org.aoc.day3;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class MemoryLineWithInstructions extends MemoryLine {
    @Override
    public void parseLine(String line) {
        String lineHandlingInstructions = line.replaceAll("don't\\(\\).*?do\\(\\)|don't\\(\\).*","");
        List<String> mulStrings = Pattern.compile("mul\\(\\d+,\\d+\\)")
                .matcher(lineHandlingInstructions)
                .results()
                .map(MatchResult::group)
                .toList();
        multipliers = mulStrings.stream().map(Multiplier::new).toList();
    }
}
