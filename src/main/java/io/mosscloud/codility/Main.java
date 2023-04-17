package io.mosscloud.codility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str = "\"Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-21:00\"";

//        Stream<String> linesFromString = str.lines();
        Collection<String> stringsList = new ArrayList<String>();
        stringsList = List.of(str.split("\n"));
//        System.out.println(stringsList);
        for(int i=0; i < stringsList.size();i++){
            String day1 = String.valueOf(stringsList.getClass());
        }
    }

}

