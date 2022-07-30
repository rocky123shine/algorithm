package com.rocky.algorithm.sort.impl.optimization;

import com.rocky.algorithm.sort.sort.Sort;

/**
 * 希尔排序
 * 思想  把 数组按照希尔步长分组 同一个步长的数据为一组 进行插入排序  直到 步长为1 插入排序后 结束
 * 希尔步长 step = 2*step+1   step < length/2
 */
public class ShellSort extends Sort<Integer> {
    public static void sort(Integer[] arr) {
        new ShellSort().calculateTime(arr, ShellSort.class);
    }

    @Override
    protected void internalSort(Integer[] arr) {
        int length = arr.length;
        int half = length >> 1;
        int step = 1;
        //可以用数组存起来  但是有空间的开销 这里不存入  使用的时候 计算相应的步长
        while (step < half) {
            step = step * 2 + 1;
        }
        while (step >= 1) {
            //已经有序的数组的最大索引为step
            for (int i = step; i < length; i++) {
                //倒叙插入
                for (int j = i; j >= step; j -= step) {
                    if (greater(arr[j - step], arr[j])) {
                        exchange(arr, j - step, j);
                    } else break;
                }
            }
            step = step >> 1;
        }
    }
}
