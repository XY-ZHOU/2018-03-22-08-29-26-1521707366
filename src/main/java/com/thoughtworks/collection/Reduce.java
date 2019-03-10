package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max(Integer::compare).get();
    }

    public double getMinimum() {
        return arrayList.stream().min(Integer::compare).get();
    }

    public double getAverage() {
        double sum = arrayList.stream().reduce(0, (a, b) -> a + b);
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        return arrayList.size() % 2 != 0 ? (double) arrayList.get(arrayList.size() / 2) : (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;
    }

    public int getFirstEven() {
        return arrayList.stream().filter(i -> i % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int firstEven = getFirstEven();
        return arrayList.indexOf(firstEven);
    }

    public boolean isEqual(List<Integer> arrList) {
        if (arrayList.size() != arrList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrList.get(i))
                return false;
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用  ??
    public Double getMedianInLinkList() {
        int leftIndex = (int) Math.floor((arrayList.size() - 1) / 2.0);
        int rightIndex = (int) Math.ceil((arrayList.size() - 1) / 2.0);
        double median = (arrayList.get(leftIndex) + arrayList.get(rightIndex)) / 2.0;
        return median;
    }

    public int getLastOdd() {
        List<Integer> list = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        return list.get(list.size() - 1);
    }

    public int getIndexOfLastOdd() {
        return arrayList.indexOf(getLastOdd());
    }
}
