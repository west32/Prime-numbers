package io.mosscloud.fibonaccinumbers.consumer;

import java.util.Collection;
public interface FibonacciConsumerStrategy {
    void consumerFibonacci(Collection<Long> fibonacciCountResult);
}
