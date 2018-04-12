package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> resList = new ArrayList<Integer>();
        while (true)
        {
            number -= 2;
            if (number <= 0)
                break;

            resList.add(number);
        }

        return resList;
    }
}
