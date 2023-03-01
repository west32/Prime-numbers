package io.mosscloud.fibonaccinumbers.consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
public class FileConsumerStrategy implements FibonacciConsumerStrategy {
    @Override
    public void consumerFibonacci(Collection<Integer> fibonacciCountResult) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("bartek.txt"));
            for (int number : fibonacciCountResult) {
                String numberAsString = number + " | ";
                writer.write(numberAsString );
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
