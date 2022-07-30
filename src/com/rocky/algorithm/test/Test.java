package com.rocky.algorithm.test;

import com.rocky.algorithm.sort.impl.base.InsertSort;
import com.rocky.algorithm.sort.impl.optimization.ShellSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] list = {5,1,4,6,3,7,2};
//        Bubble.sort(list);
//        Select.sort(list);
        //InsertSort.sort(list);
        ShellSort.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
