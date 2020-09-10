package ua.com.alevel.tasks.task1;

import java.util.List;

public interface NumberAggregator<T extends Number> {
    T sum(List<? extends Number> numbers);
}
