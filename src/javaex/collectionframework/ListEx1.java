package javaex.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        List hap = new ArrayList<>();
        List gyo = new ArrayList<>();
        List cha = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(list1.get(0));
//        gyo
        gyo.addAll(list1);
        gyo.retainAll(list2);
        System.out.println(gyo);

//        cha
        cha.addAll(list1);
        cha.removeAll(list2);
        System.out.println(cha);

//        hap
        hap.addAll(list1);
        hap.removeAll(gyo);
        hap.addAll(list2);
        System.out.println(hap);




    }
}
