package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public double getMinimum() {
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public double getAverage() {

        double sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        return arrayList.size() % 2 != 0 ? (double) arrayList.get(arrayList.size() / 2) : (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;
    }

    public int getFirstEven() {
        for (int i : arrayList) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != arrayList2.get(i))
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
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i) % 2 != 0) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i) % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
