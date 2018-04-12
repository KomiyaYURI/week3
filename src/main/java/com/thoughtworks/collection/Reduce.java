package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double sum=0;
        int nums = arrayList.size();
        for (int i : arrayList)
            sum += i;

        return sum / nums;
    }

    public double getOrderedMedian() {
        List<Integer> tmpList = arrayList;
        Collections.sort(tmpList);

        int len = tmpList.size();
        if (len % 2 == 1)
            return tmpList.get(len / 2);
        else
            return 1.0 * (tmpList.get(len/2 - 1) + tmpList.get(len/2)) / 2;
    }

    public int getFirstEven() {
        for (int i : arrayList)
            if (i % 2 == 0)
                return i;

        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++)
            if (arrayList.get(i) % 2 == 0)
                return i;

        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        int list1_len = this.arrayList.size();
        int list2_len = arrayList.size();

        if (list1_len != list2_len)
            return false;

        for (int i = 0; i < list1_len; i++)
            if (this.arrayList.get(i) != arrayList.get(i))
                return false;

        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        int len = arrayList.size();

        if (len % 2 == 1)
            return Double.parseDouble(singleLink.getNode((len+1) / 2).toString());
        else
            return (Double.parseDouble(singleLink.getNode(len / 2).toString()) +
                    Double.parseDouble(singleLink.getNode((len / 2 + 1)).toString())) / 2;
    }

    public int getLastOdd() {
        int i = arrayList.size();
        while (i > 0)
        {
            i--;
            if (arrayList.get(i) % 2 == 1)
                return arrayList.get(i);
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        int i = arrayList.size();
        while (i > 0)
        {
            i--;
            if (arrayList.get(i) % 2 == 1)
                return i;
        }
        return 0;
    }
}
