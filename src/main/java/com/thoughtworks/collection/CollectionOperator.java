package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> reslis = new ArrayList<Integer>();
        int i;
        boolean op_flag;

        if (left < right)
            op_flag = true;
        else
            op_flag = false;

        i = left;
        while (true)
        {
            reslis.add(i);
            if (i == right)
                break;

            if (op_flag == true)
                i++;
            else
                i--;
        }
        return reslis;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> reslis = new ArrayList<Integer>();
        int i;
        boolean op_flag;

        if (left < right)
            op_flag = true;
        else
            op_flag = false;

        i = left;
        while (true)
        {
            if (i % 2 == 0)
                reslis.add(i);

            if (i == right)
                break;

            if (op_flag == true)
                i++;
            else
                i--;
        }
        return reslis;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> reslis = new ArrayList<Integer>();

        for (int i : array)
        {
            if (i % 2 == 0)
                reslis.add(i);
        }
        return reslis;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> tmpList = new ArrayList<Integer>();
        List<Integer> reslis = new ArrayList<Integer>();

        for (int i : firstArray)
            tmpList.add(i);

        for (int i : secondArray)
        {
            if (tmpList.contains(i))
                reslis.add(i);
        }

        return reslis;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> reslis = new ArrayList<Integer>();

        for (int i : firstArray)
        {
            if (!reslis.contains(i))
                reslis.add(i);
        }

        for (int i : secondArray)
        {
            if (!reslis.contains(i))
                reslis.add(i);
        }

        return reslis;
    }
}
