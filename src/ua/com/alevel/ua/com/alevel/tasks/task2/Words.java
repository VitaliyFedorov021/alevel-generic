package ua.com.alevel.ua.com.alevel.tasks.task2;

import java.util.List;
import java.util.Map;

public interface Words {
    Map<Integer, String> getMostFrequentWords(List<String> words, int limit);
}
