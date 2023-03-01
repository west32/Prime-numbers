package io.mosscloud.fibonaccinumbers.consumer;

import java.util.Collection;
public class PrintConsumerStrategy implements FibonacciConsumerStrategy {
    @Override
    public void consumerFibonacci(Collection<Integer> fibonacciCountResult) {
        System.out.println(fibonacciCountResult);
    }
}
