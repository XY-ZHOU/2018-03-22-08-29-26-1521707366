package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(n -> n * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(n -> letterList.get(n - 1)).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        ArrayList<String> list = new ArrayList<>();
        for (int i : array) {
            String letters = i <= 26 ? letterList.get(i - 1) : letterList.get(i / 26 - 1) + letterList.get(i % 26 - 1);
            list.add(letters);
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
