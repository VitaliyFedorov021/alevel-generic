package ua.com.alevel.collections;

import java.util.ArrayList;
import java.util.List;

public class Main<T extends A> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Main<B> main = new Main<>();
        main.getItem();
//        List<Integer> list = new ArrayList<>();
//        Main main = new Main();
//        list.add(5);
//        list.add(10);
//        System.out.println(main.getByIndex(list, 1));
    }
//    public static <T> int length(T[] array) {
//        return array.length;
//    }
//    public <U> U getByIndex(List<U> list, int index) {
//        return list.get(index);
//    }
}
