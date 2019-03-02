package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

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
        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        return sum * 3 + arrayList.size() * 2;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i : arrayList) {
            i % 2 != 0 ? list.add(i * 3 + 2) : list.add(i);
        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            if (i % 2 != 0) {
                sum += i * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list.size() % 2 != 0)?(double) list.get(list.size() / 2):
        (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        return sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        for (int i : set) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        TreeSet<Integer> setOfEven = new TreeSet<Integer>();
        TreeSet<Integer> setOfOdd = new TreeSet<Integer>(Collections.reverseOrder());
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 2 == 0) {
                setOfEven.add(i);
            } else {
                setOfOdd.add(i);
            }
        }
        for (int i : setOfEven) {
            list.add(i);
        }
        for (int i : setOfOdd) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return list;
    }
}
