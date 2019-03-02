package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> newList = transformToOneDimesional();
        Iterator<Integer> iterator = newList.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }
}
