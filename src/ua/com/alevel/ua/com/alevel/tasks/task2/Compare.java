package ua.com.alevel.ua.com.alevel.tasks.task2;

import java.util.Comparator;

public class Compare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
