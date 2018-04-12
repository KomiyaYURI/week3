package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resList = new ArrayList<Integer>();
        for (int i : array)
            resList.add(i * 3);

        return resList;
    }

    public List<String> mapLetter() {
        List<String> resList = new ArrayList<String>();
        for (int i : array)
            resList.add(letters[i-1]);

        return resList;
    }

    public List<String> mapLetters() {
        List<String> resList = new ArrayList<String>();
        for (int i : array)
        {
            StringBuilder tmpStr = new StringBuilder();
            while (i > 26)
            {
                int index = (i-1) / 26;
                tmpStr.append(letters[index-1]);

                i -= index * 26;
            }
            tmpStr.append(letters[i-1]);
            resList.add(tmpStr.toString());
        }

        return resList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resList = array;
        Collections.sort(resList);
        Collections.reverse((resList));

        return resList;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> resList = array;
        Collections.sort(resList);

        return resList;
    }
}
