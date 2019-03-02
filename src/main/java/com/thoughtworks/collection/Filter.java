package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : firstList) {
            if (secondList.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public List<Integer> getDifferentElements() {
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            set.add(i);
        }
        for (int i : set) {
            list.add(i);
        }
        return list;
    }
}