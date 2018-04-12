package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resList = new ArrayList<Integer>();
        for (Integer[] arr : array)
        {
            for (int i : arr)
                resList.add(i);
        }
        return resList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resList = new ArrayList<Integer>();
        for (Integer[] arr : array)
        {
            for (int i : arr)
            {
                if (!resList.contains(i))
                    resList.add(i);
            }
        }
        return resList;
    }
}
