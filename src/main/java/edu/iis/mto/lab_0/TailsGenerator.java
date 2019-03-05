package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null){
            return new ArrayList<>(0);
        }

        return new ArrayList<>(value.length());
    }

}
