package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        while (number - 2 >= 0) {
            number = number - 2;
            list.add(number);
        }
        return list;
    }
}
