package com.rocky.algorithm.test;

import com.rocky.algorithm.sort.Bubble;
import com.rocky.algorithm.sort.Select;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] list = {7,6,5,4,3,2,1};
//        Bubble.sort(list);
        Select.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
