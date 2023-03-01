package io.mosscloud.fibonaccinumbers;

import io.mosscloud.fibonaccinumbers.consumer.FibonacciConsumerStrategy;
import io.mosscloud.fibonaccinumbers.consumer.FileConsumerStrategy;
import io.mosscloud.fibonaccinumbers.consumer.PrintConsumerStrategy;

import java.util.ArrayList;
import java.util.List;

public class CountFibonacci {
    private final FibonacciConsumerStrategy fibonacciConsumerStrategy;
    public CountFibonacci(ConsumerStrategyType consumerStrategyType) {
        this.fibonacciConsumerStrategy = switch (consumerStrategyType) {
            case FILE -> new FileConsumerStrategy();
            case PRINT -> new PrintConsumerStrategy();
        };
    }
    public void countFibonacci(int howManyNumbers) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int firstNumber = 0;
        int secondNumber = 1;
        if (howManyNumbers == 0) {
            fibonacciConsumerStrategy.consumerFibonacci(fibonacciNumbers);
            return;
        }
        fibonacciNumbers.add(firstNumber);
        if (howManyNumbers >= 2) {
            fibonacciNumbers.add(secondNumber);
        }
        if (howManyNumbers > 2) {
            for (int i = 2; i < howManyNumbers; i++) {
                int thirdNumber = firstNumber + secondNumber;
                fibonacciNumbers.add(thirdNumber);
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }
        fibonacciConsumerStrategy.consumerFibonacci(fibonacciNumbers);
    }
}





