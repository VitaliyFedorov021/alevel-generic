package ua.com.alevel.ua.com.alevel.tasks.task2;

import java.util.*;

public class WordsImpl implements Words  {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hello");
        words.add("Vlad");
        words.add("How");
        words.add("Cake");
        words.add("Cake");
        words.add("Candy");
        words.add("Java");
        words.add("Java");
        words.add("Java");
        words.add("Java");
        words.add("Hello");
        Map<Integer, String> frequentWords = new WordsImpl().getMostFrequentWords(words, 2);
        for (Map.Entry<Integer, String> currentMap:
             frequentWords.entrySet()) {
            System.out.println(currentMap.getValue());
        }


    }

    @Override
    public Map<Integer, String> getMostFrequentWords(List<String> words, int limit) {
        Set<String> wordsSet = new HashSet<>();
        Map<Integer, String> frequentWords = new TreeMap<>(new Compare());
        for (String word:
             words) {
            wordsSet.add(word);
        }
        int count = 0;
        for (String word:
                wordsSet) {
            if (count == limit) {
                break;
            } else {
                frequentWords.put(Collections.frequency(words, word), word);
                count++;
            }
        }

        return frequentWords;
    }
}
