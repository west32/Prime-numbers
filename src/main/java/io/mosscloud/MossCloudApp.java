package io.mosscloud;

import io.mosscloud.fibonaccinumbers.ConsumerStrategyType;
import io.mosscloud.fibonaccinumbers.CountFibonacci;
import io.mosscloud.fibonaccinumbers.FibonacciScanner;
import io.mosscloud.primenumbers.CountPrimeNumbers;
import io.mosscloud.primenumbers.GetRangeOfPrimeNumbers;

import java.util.Objects;
import java.util.Scanner;

public class MossCloudApp {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'prime' to count prime numbers or 'fibonacci' to count fibonacci numbers ");
        String option = scanner.nextLine();
        if (Objects.equals(option, "prime")) {
            GetRangeOfPrimeNumbers getRangeOfPrimeNumbers = new GetRangeOfPrimeNumbers();
            int minNumberOfRange = getRangeOfPrimeNumbers.getMinNumberOfRange();
            int maxNumberOfRange = getRangeOfPrimeNumbers.getMaxNumberOfRange();
            CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
            countPrimeNumbers.printPrimeNumbers(minNumberOfRange, maxNumberOfRange);
        } else if (Objects.equals(option, "fibonacci")){
            System.out.println(" input 1 to save numbers to file");
            System.out.println(" input 2 to print numbers");
            int consumerStrategyNumber= scanner.nextInt();
            ConsumerStrategyType consumerStrategyType = ConsumerStrategyType.values()[consumerStrategyNumber-1];
            FibonacciScanner fibonaccscanner = new FibonacciScanner();
            int howManyNumbers = fibonaccscanner.getHowManyNumbers();
            CountFibonacci count = new CountFibonacci(consumerStrategyType);
            count.countFibonacci(howManyNumbers);
        }
    }
}


//TODO
//1. przeczytac o API
//2.MVC przeczytac model view controler (nastepna lekcja) PODSTAWY
//3. refactor, wyczyscic fibonacci kod
//4. wykluczyc i obsluzyc niepoprawny wybor fibonacci/prime (duze male litery i spacje na koncu i poczatku)
//5.PR i przesylam
//6. wejsciowka z GITA
//7. retrospekcja bledu z commitami squashem z dzisiejszych commitow i pr
// ZACZAĆ REALIZOWAC OD KONCA