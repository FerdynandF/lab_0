package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>(0);
        }

        ArrayList<String> tailsArrayList = new ArrayList<>(value.length() + 1);
        int size = value.length();
        for (int i = 0; i < size; i++) {
            tailsArrayList.add(value.substring(i + 1, size));
        }

        return tailsArrayList;

    }

}
