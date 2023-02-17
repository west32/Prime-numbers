package io.mosscloud.primenumbers;

public class PrimeNumbersCount {

    public void printPrimeNumbers(int minNumberOfRange, int maxNumberOfRange) {
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

