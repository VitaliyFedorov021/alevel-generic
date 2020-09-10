package ua.com.alevel.tasks.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main <T extends Number> implements NumberAggregator<T> {
    private static final List<Integer> ints = new LinkedList<>();
    private static final List<Double> doubles = new ArrayList<>();
    private static final List<Short> shorts = new LinkedList<>();
    static {
        ints.add(53);
        ints.add(232);
        ints.add(-643);
        ints.add(0);
        ints.add(100);
        doubles.add(54.23);
        doubles.add(10.423);
        doubles.add(10.0);
        doubles.add(23.1);
        shorts.add((short) 5);
        shorts.add((short) 12);
        shorts.add((short) 10);
        shorts.add((short) 11);
        shorts.add((short) 6);



    }
    public static void main(String[] args) {
        new Main<Integer>().sum(ints);
        new Main<Double>().sum(doubles);
        new Main<Short>().sum(shorts);
    }

    @Override
    public T sum(List<? extends Number> numbers) {
        T sum = null;
        for (Number currentNumber:
             numbers) {
            //sum += currentNumber;
        }
        return sum;
    }
}
