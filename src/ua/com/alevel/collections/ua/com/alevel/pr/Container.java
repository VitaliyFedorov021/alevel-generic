package ua.com.alevel.collections.ua.com.alevel.pr;


import java.util.ArrayList;
import java.util.List;

public class Container {
    public static void main(String[] args) {
        List<B> bList = new ArrayList<>();
//        List<A> aList = bList;
        List<A> aList = new ArrayList<>();
        showNames(aList);
        showNames(bList);
    }

    public static void showNames(List<? extends A> list) {
        for (A a : list) {
            System.out.println(a.getName());
        }
    }
}
