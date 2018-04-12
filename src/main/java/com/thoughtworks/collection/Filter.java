package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> newArr = new ArrayList<Integer>();

        for (int i : array)
        {
            if (i % 2 == 0)
                newArr.add(i);
        }

        return newArr;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> newArr = new ArrayList<Integer>();

        for (int i : array)
        {
            if (i % 3 == 0)
                newArr.add(i);
        }

        return newArr;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> tmpList = new ArrayList<Integer>();
        List<Integer> reslis = new ArrayList<Integer>();

        for (int i : secondList)
            tmpList.add(i);

        for (int i : firstList)
        {
            if (tmpList.contains(i))
                reslis.add(i);
        }

        return reslis;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> newArr = new ArrayList<Integer>();

        for (int i : array)
        {
            if (!newArr.contains(i))
                newArr.add(i);
        }

        return newArr;
    }
}