package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //求leftBorder 和rightBorder之间的偶数和
        int sum = 0;
        if (leftBorder <= rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {

                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
        } else {
            for (int i = rightBorder; i <= leftBorder; i++) {

                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }

        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        //求leftBorder 和rightBorder之间的奇数和

        if (rightBorder < leftBorder)
        {
            leftBorder += rightBorder;
            rightBorder = leftBorder - rightBorder;
            leftBorder = leftBorder - rightBorder;
        }

        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        int sum1 = 0;
        for (int i : arrayList) {
            sum1 = sum1 + (i * 3 + 2);
        }
        return sum1;

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        //求数组中奇数元素的3倍加2，偶数元素不变的数组
        List<Integer> reslist = new ArrayList<Integer>();
        for (int i : arrayList) {

            if (i % 2 != 0) {
                int j = i * 3 + 2;
                reslist.add(j);
            } else {
                reslist.add(i);
            }

        }
        return reslist;

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //求数组中奇数元素的3倍加5的和
        int sum = 0;
        for (int i : arrayList) {

            if (i % 2 != 0) {
                sum = sum + (i * 3 + 5);
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {

        //求数组中所有偶数组成的数组的中位数
        int count = 0;
        double mid = 0;
        List<Integer> evenlis = new ArrayList<Integer>();
        for (int i : arrayList) {

            if (i % 2 == 0) {
                count++;
                evenlis.add(i);
            }
        }
        if (count % 2 != 0) {
            int ind = (count + 1) / 2;
            mid = evenlis.get(ind - 1);
        } else {
            int ind = (count / 2);
            mid = (evenlis.get(ind) + evenlis.get(ind - 1)) / 2;

        }
        return mid;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        //求数组中所有偶数的平均数
        int count=0, sum=0;
        double avg = 0;
        for (int i : arrayList)
        {
            if (i % 2 == 0)
            {
                count++;
                sum += i;
            }
        }

        avg = sum / count;
        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        // 求数组中所有偶数组成的数组是否包含某特定的数specialElment

        List<Integer> evenlis = new ArrayList<Integer>();
        for (int i : arrayList) {

            if (i % 2 == 0) {

                evenlis.add(i);
            }
        }
        if (evenlis.contains(specialElment)) {
            return true;
        } else {
            return false;
        }

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        //去除数组中所有偶数组成的数组的重复数
        List<Integer> evenlis = new ArrayList<Integer>();
        for (int i : arrayList) {

            if (i % 2 == 0) {

                evenlis.add(i);
            }
        }
        return evenlis;

    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        //排序数组 结果使数组偶数在递增在前，奇数递减在后

        List<Integer> oddlis = new ArrayList<Integer>();
        List<Integer> evenlis = new ArrayList<Integer>();
        for (int i : arrayList) {

            if (i % 2 == 1) {
                oddlis.add(i);
            } else {
                evenlis.add(i);
            }
        }

        Collections.sort(oddlis);
        Collections.sort(evenlis);
        Collections.reverse(oddlis);

        evenlis.addAll(oddlis);
        return evenlis;
    }

    public List<Integer>  getProcessedList(List<Integer> arrayList) {

        // 数组中前一个元素和后一个元素的和的3倍的数组
        List<Integer> reslis = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size()-1; i++) {
            int j = (arrayList.get(i) + arrayList.get(i + 1))*3;
            reslis.add(j);

        }
        return reslis;

    }
}
