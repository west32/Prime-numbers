package io.mosscloud.primenumbers;

import java.util.Scanner;

public class GetRangeOfPrimeNumbers {




    Scanner scanner = new Scanner(System.in);

    public int getMinNumberOfRange() {
        Integer minNumberOfRange = null;
        {
            while (minNumberOfRange == null) {
                System.out.println("Podaj pierwszą liczbę z przedziału");
                try {
                    minNumberOfRange = Integer.parseInt(scanner.next());

                    if (minNumberOfRange <= 1) {
                        minNumberOfRange = 2;
                        System.out.println("Liczby pierwszę są liczbami dodatnimi, a ich przedział zaczyna sie od 2 ;)");

                    }
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("podaj liczbe calkowitą");
                }
            }
        }
        return minNumberOfRange;
    }

    public int getMaxNumberOfRange(){
        Integer maxNumberOfRange = null;
        while(maxNumberOfRange == null){
            System.out.println("Podaj ostatnią liczbę z przedziału");
            try{
                maxNumberOfRange = Integer.parseInt(scanner.next());
            } catch (NumberFormatException numberFormatException) {
            System.out.println("podaj liczbe calkowitą");
            }
        }
        return maxNumberOfRange;
    }

}

