package io.mosscloud.codility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AdventCallendarSecond {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\barte\\OneDrive\\Pulpit\\Java\\RecrutationTask\\src\\main\\java\\io\\mosscloud\\codility\\input advent code2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String intLine;
        int counter = -1;
        Integer firstLine;
        Integer secondLine;
        Integer thirdLine;
        Integer actualLine;

        while ((intLine = bufferedReader.readLine()) != null){
            actualLine = Integer.parseInt(intLine);
            if (actualLine > firstLine){
                counter++;
            }
            firstLine = actualLine;

        }
        System.out.println(counter);
    }
}


