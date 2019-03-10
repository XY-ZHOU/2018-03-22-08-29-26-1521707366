package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int left = Math.min(leftBorder, rightBorder);
        int right = Math.max(leftBorder, rightBorder);
        int sum = 0;
        while (left <= right) {
            if (left % 2 == 0) {
                sum += left;
            }
            left++;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int left = Math.min(leftBorder, rightBorder);
        int right = Math.max(leftBorder, rightBorder);
        int sum = 0;
        while (left <= right) {
            if (left % 2 != 0) {
                sum += left;
            }
            left++;
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = arrayList.stream().reduce(0, (a, b) -> a + b);
        return sum * 3 + arrayList.size() * 2;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i : arrayList) {
            if (i % 2 != 0) {
                list.add(i * 3 + 2);
            } else {
                list.add(i);
            }
        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        return list.stream().reduce(0, (a, b) -> a + b);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return (list.size() % 2 != 0) ? (double) list.get(list.size() / 2) : (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return list.stream().reduce(0, (a, b) -> a + b) / list.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return list.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return list.stream().distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list = arrayList.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(n -> n % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.addAll(oddList);
        return list;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return list;
    }
}
