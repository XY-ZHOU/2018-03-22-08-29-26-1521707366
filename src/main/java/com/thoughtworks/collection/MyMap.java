package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i * 3);
        }
        return list;
    }

    public List<String> mapLetter() {
        ArrayList<String> list = new ArrayList<>();
        for (int i : array) {
            list.add(letterList.get(i - 1));
        }
        return list;
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
        Integer[] arr = (Integer[]) array.toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.asList(arr);
    }

    public List<Integer> sortFromSmall() {
        Integer[] arr = (Integer[]) array.toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.asList(arr);
    }
}
