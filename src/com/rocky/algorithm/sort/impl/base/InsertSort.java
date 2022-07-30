package com.rocky.algorithm.sort.impl.base;

import com.rocky.algorithm.sort.sort.Sort;

/**
 * 插入排序
 * 思路 数组分成 已排序的和未排序的两组 不断的从未排序中取出元素 插入到排序的数组
 */
public class InsertSort extends Sort<Integer> {
    public static void sort(Integer[] arr) {
        new InsertSort().calculateTime(arr, InsertSort.class);
    }

    @Override
    protected void internalSort(Integer[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {

            for (int s = i - 1; s >= 0; s--) {
                if (greater(arr[s], arr[s + 1])) {
                    exchange(arr, s, s + 1);
                } else break;
            }
        }
    }
}
