package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        return Arrays.stream(array).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> newList = transformToOneDimesional();
        return newList.stream().distinct().collect(Collectors.toList());
    }
}
