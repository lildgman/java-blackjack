package javaex.set;

import java.util.*;

public class RunSet {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();

        set1.add(new Student("odg", 30));
        set1.add(new Student("qwe", 25));
        set1.add(new Student("asd", 28));
        set1.add(new Student("zxc", 24));

        System.out.println("set1 = " + set1);

        // List로 변환 후 정렬
        List<Student> setToList = new ArrayList<>();
        setToList.addAll(set1);
//        Collections.sort(setToList);
        setToList.sort((s1,s2) ->
                s1.getName().compareTo(s2.getName()));
//        Collections.sort(setToList, (s1, s2) ->{
//                    if(s1.getAge() > s2.getAge()){
//                        return 1;
//                    } else if (s1.getAge() < s2.getAge()){
//                        return -1;
//                    } else {
//                        return 0;
//                    }
//                });
        System.out.println("setToList = " + setToList);


//        TreeSet<Student> set2 = new TreeSet<>();
//        set2.addAll(set1);
//        System.out.println("set2 = " + set2);


    }
}
