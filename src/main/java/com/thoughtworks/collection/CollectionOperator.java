package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


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
        List<Integer> list = getListByInterval(left, right);
        return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());

    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return Arrays.stream(firstArray).filter(n -> list.contains(n)).boxed().collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = Arrays.stream(firstArray).collect(Collectors.toList());
        list.addAll(Arrays.stream(secondArray).filter(n -> !list.contains(n)).collect(Collectors.toList()));
        return list;
    }
}
