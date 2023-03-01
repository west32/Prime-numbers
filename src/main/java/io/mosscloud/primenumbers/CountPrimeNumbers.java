package io.mosscloud.primenumbers;

public class CountPrimeNumbers {


    public void printPrimeNumbers(int minNumberOfRange, int maxNumberOfRange) {

        int beginingOfRange = Math.max(Math.min(minNumberOfRange, maxNumberOfRange), 2);
        int endOfRange = Math.max(minNumberOfRange, maxNumberOfRange);

        for (int i = beginingOfRange; i <= endOfRange; i++) {
            boolean isPrimeNumber = true;
            int minDividingNumber = 2;
            int maxDividingNumber = i - 1;
            for (int j = minDividingNumber; j <= maxDividingNumber; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(i);

            }
        }

    }
}