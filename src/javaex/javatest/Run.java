package javaex.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Person[] pArr = new Person[3];
        pArr[0] = new Person("가나다", 20);
        pArr[1] = new Person("ㅁㅁㅁ", 10);
        pArr[2] = new Person("ㅂㅂㅂ", 30);

        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].getName());
        }
    }

}
