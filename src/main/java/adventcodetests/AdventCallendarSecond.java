package adventcodetests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AdventCallendarSecond {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\barte\\OneDrive\\Pulpit\\Java\\RecrutationTask\\src\\main\\java\\io\\mosscloud\\codility\\input advent code2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String intLine;
        int counter = -1;
        int firstLine = 0;
        int secondLine = 0;
        int thirdLine = 0;
        int actualLine;
        int previousSum = 0;
        int actualSum = 0;

        while ((intLine = bufferedReader.readLine()) != null){
            actualLine = Integer.parseInt(intLine);
            firstLine = secondLine;
            secondLine = thirdLine;
            thirdLine = actualLine;
            if (firstLine != 0 && secondLine != 0 && thirdLine != 0){
                actualSum = firstLine + secondLine + thirdLine;
            }
            if (actualSum > previousSum){
                counter ++;
            }
            previousSum = actualSum;

            }

        System.out.println(counter);

        }

    }



