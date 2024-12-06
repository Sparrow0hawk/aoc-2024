package org.aoc.day3;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Multiplier {
    List<Integer> factors;
    public int product;

    public Multiplier(String expression) {
        factors = Pattern.compile("\\d+")
                .matcher(expression)
                .results()
                .map(MatchResult::group)
                .map(Integer::parseInt)
                .toList();

        product = factors.stream().reduce(1, (a, b) -> a * b);
    }
}
