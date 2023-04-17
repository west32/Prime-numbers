package io.mosscloud.fibonaccinumbers;

import java.util.Scanner;

public class FibonacciApp {


    public static void main(String[] args) {
        System.out.println(" input 1 to save numbers to file");
        System.out.println(" input 2 to print numbers");
        Scanner scanner = new Scanner(System.in);
        int consumerStrategyNumber = scanner.nextInt();
        ConsumerStrategyType consumerStrategyType = ConsumerStrategyType.values()[consumerStrategyNumber-1];
        FibonacciScanner fibonaccscanner = new FibonacciScanner();
        int howManyNumbers = fibonaccscanner.getHowManyNumbers();
        CountFibonacci count = new CountFibonacci(consumerStrategyType);
        count.countFibonacci(howManyNumbers);
    }
}

