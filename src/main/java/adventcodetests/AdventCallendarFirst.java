package adventcodetests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AdventCallendarFirst {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\barte\\OneDrive\\Pulpit\\Java\\RecrutationTask\\src\\main\\java\\io\\mosscloud\\codility\\input advent code2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String intLine;
        int counter = -1;
        Integer previousLine = 0;
        Integer actualLine;

        while ((intLine = bufferedReader.readLine()) != null){
            int inValue = Integer.parseInt(intLine);
            actualLine = inValue;
            if (actualLine > previousLine){
                counter++;
            }
            previousLine = actualLine;

        }
        System.out.println(counter);
    }
}
