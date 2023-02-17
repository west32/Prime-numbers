package io.mosscloud.primenumbers;

import java.util.Scanner;

public class PrimeNumbersApp {
    public static void main(String[] args) {

//        Integer minNumberOfRange = null;
//        Integer maxNumberOfRange = null;
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (minNumberOfRange == null|| maxNumberOfRange == null) {
//            System.out.println("Podaj pierwszą liczbę z przedziału");
//            try {
//                minNumberOfRange = Integer.parseInt(scanner.next());
//
//                if (minNumberOfRange <= 1) {
//                    minNumberOfRange = 2;
//                    System.out.println("Liczby pierwszę są liczbami dodatnimi, a ich przedział zaczyna sie od 2 ;)");
//
//                }
//                System.out.println("Podaj ostatnią liczbę z przedziału");
//                maxNumberOfRange = Integer.parseInt(scanner.next());
//            }catch(NumberFormatException numberFormatException){
//                System.out.println("podaj liczbe calkowitą");
//            }
//
//        }
        GetRangeOfPrimeNumbers getRangeOfPrimeNumbers = new GetRangeOfPrimeNumbers();
        int minNumberOfRange = getRangeOfPrimeNumbers.getMinNumberOfRange();
        int maxNumberOfRange = getRangeOfPrimeNumbers.getMaxNumberOfRange();
        PrimeNumbersCount primeNumbersCount = new PrimeNumbersCount();
        primeNumbersCount.printPrimeNumbers(minNumberOfRange, maxNumberOfRange);


    }
}

//TODO
// obsluzyc max range number w ten sam sposob ale zeby nie powielac kodu z dobrymi praktykami
//refaktor nie trzymac w mainie i zrobic pull request pakiety i podzial logiczny
//
//* obsluzyc przedzial malejacy