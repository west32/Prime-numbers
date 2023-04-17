package io.mosscloud;

import io.mosscloud.fibonaccinumbers.ConsumerStrategyType;
import io.mosscloud.fibonaccinumbers.CountFibonacci;
import io.mosscloud.fibonaccinumbers.FibonacciScanner;
import io.mosscloud.primenumbers.CountPrimeNumbers;
import io.mosscloud.primenumbers.GetRangeOfPrimeNumbers;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class MossCloudApp {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Type 'prime' to count prime numbers or 'fibonacci' to count fibonacci numbers ");
            String option = scanner.nextLine().toLowerCase().trim();
            if (Objects.equals(option, "prime")) {
                GetRangeOfPrimeNumbers getRangeOfPrimeNumbers = new GetRangeOfPrimeNumbers();
                int minNumberOfRange = getRangeOfPrimeNumbers.getMinNumberOfRange();
                int maxNumberOfRange = getRangeOfPrimeNumbers.getMaxNumberOfRange();
                CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
                countPrimeNumbers.printPrimeNumbers(minNumberOfRange, maxNumberOfRange);
                break;
            } else if (Objects.equals(option, "fibonacci")) {
                System.out.println(" input 1 to save numbers to file");
                System.out.println(" input 2 to print numbers");
                int consumerStrategyNumber = scanner.nextInt();
                ConsumerStrategyType consumerStrategyType = ConsumerStrategyType.values()[consumerStrategyNumber - 1];
                FibonacciScanner fibonaccscanner = new FibonacciScanner();
                int howManyNumbers = fibonaccscanner.getHowManyNumbers();
                CountFibonacci count = new CountFibonacci(consumerStrategyType);
                count.countFibonacci(howManyNumbers);
                break;
            }else {
                System.out.println("You typed " + option + " instead of 'prime' or 'fibonacci'");
                System.out.println("Please try again");
            }
        }
    }
}


