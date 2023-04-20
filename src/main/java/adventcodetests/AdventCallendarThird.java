package adventcodetests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AdventCallendarThird {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/java/adventcodetests/inputDay2.txt"));
        int horizontal = 0;
        int depth = 0;
        String direction = "";
        int durationInMeters = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            direction = tokenizer.nextToken();
            durationInMeters = Integer.parseInt(tokenizer.nextToken());

            switch (direction) {
                case "forward" -> horizontal += durationInMeters;
                case "up" -> depth -= durationInMeters;
                case "down" -> depth += durationInMeters;
            }
        }
        scanner.close();
        System.out.println("horizontal:" + horizontal + "\ndepth: " + depth);
        System.out.println(horizontal * depth);

    }
}


