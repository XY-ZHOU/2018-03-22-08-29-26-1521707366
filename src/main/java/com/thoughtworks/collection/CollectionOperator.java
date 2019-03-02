package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int firstNum = left < right ? left : right;
        int lastNum = left >= right ? left : right;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = firstNum; i <= lastNum; i++) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int firstNum = left < right ? left : right;
        int lastNum = left >= right ? left : right;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = firstNum; i <= lastNum; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer numOne : firstArray) {
            list.add(numOne);
        }
        for (Integer numTwo : secondArray) {
            if (!Arrays.asList(firstArray).contains(numTwo)) {
                list.add(numTwo);
            }
        }
        return list;
    }
}
