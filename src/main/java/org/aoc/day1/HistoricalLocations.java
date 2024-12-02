package org.aoc.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class HistoricalLocations {

    private List<Integer> listOne;
    private List<Integer> listTwo;

    public HistoricalLocations() {
        listOne = new ArrayList<>();
        listTwo = new ArrayList<>();
    }

    public void add_line(String line) {
        String[] splitStr = line.split("\\s+");
        listOne.add(Integer.parseInt(splitStr[0]));
        listTwo.add(Integer.parseInt(splitStr[1]));
    }

    public void sort_lists() {
        Collections.sort(listOne);
        Collections.sort(listTwo);
    }

    public List<Integer> distances() {
        this.sort_lists();
        List<Integer> locationDiff = new ArrayList<>();
        Iterator<Integer> listOneIterator = listOne.iterator();
        Iterator<Integer> listTwoIterator = listTwo.iterator();

        while (listOneIterator.hasNext() && listTwoIterator.hasNext()) {
            Integer locationOne = listOneIterator.next();
            Integer locationTwo = listTwoIterator.next();
            locationDiff.add(abs(locationOne - locationTwo));
        }

        return locationDiff;
    }

}
