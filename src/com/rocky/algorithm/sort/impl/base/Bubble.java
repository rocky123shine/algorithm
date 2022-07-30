package com.rocky.algorithm.sort.impl.base;

import com.rocky.algorithm.sort.sort.Sort;

public class Bubble extends Sort<Integer> {
    public static void sort(Integer[] arr) {
        new Bubble().calculateTime(arr, Bubble.class);
    }

    @Override
    protected void internalSort(Integer[] arr) {
        int length = arr.length;
        for (int j = length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (greater(arr[i], arr[i + 1])) {
                    exchange(arr, i, i + 1);
                }
            }

        }
    }

    @Override
    protected void exchange(Integer[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        exchangeNum++;
    }
}
