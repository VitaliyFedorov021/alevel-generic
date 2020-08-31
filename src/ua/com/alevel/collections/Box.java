package ua.com.alevel.collections;

import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public T get(int i) {
        return list.get(i);
    }

    public void add(T value) {
        list.add(value);
    }
}
