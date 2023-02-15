package io.mosscloud.primenumbers;

import java.util.Scanner;

public class PrimeNumbersApp {
    public static void main(String[] args) {

        int minNumberOfRange;
        int maxNumberOfRange;



//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą liczbę z przedziału");
            String minNumberOfRangeAsString = scanner.next();
            try {
                minNumberOfRange = Integer.parseInt(minNumberOfRangeAsString);
                if (minNumberOfRange <= 1) {
                    minNumberOfRange = 2;
                    System.out.println("Liczby pierwszę są liczbami dodatnimi, a ich przedział zaczyna sie od 2 ;)");
                    break;
                }
            }catch(NumberFormatException numberFormatException){
                System.out.println("podaj liczbe calkowitą");
            }
        }

        System.out.println("Podaj ostatnią liczbę z przedziału");
        maxNumberOfRange = scanner.nextInt();


        for (int i = minNumberOfRange; i <= maxNumberOfRange; i++) {
            boolean iIsPrimeNumber = true;
            int minDividingsNumber = 2;
            int maxDividingsNumber = i - 1;
            for (int j = minDividingsNumber; j <= maxDividingsNumber; j++) {
                if (i % j == 0) {
                    iIsPrimeNumber = false;
                    break;
                }
            }
            if (iIsPrimeNumber) {
                System.out.println(i);
            }
        }
    }
}

//TODO
//
//
//
//* obsluzyc przedzial malejacy