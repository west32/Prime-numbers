package io.mosscloud.primenumbers;

public class PrimeNumbersApp{
    public static void main(String[] args) {

        GetRangeOfPrimeNumbers getRangeOfPrimeNumbers = new GetRangeOfPrimeNumbers();
        int minNumberOfRange = getRangeOfPrimeNumbers.getMinNumberOfRange();
        int maxNumberOfRange = getRangeOfPrimeNumbers.getMaxNumberOfRange();
        CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
        countPrimeNumbers.printPrimeNumbers(minNumberOfRange, maxNumberOfRange);


    }
}

