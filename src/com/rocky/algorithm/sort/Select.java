package com.rocky.algorithm.sort;

public class Select extends Sort<Integer> {

    public static void sort(Integer[] arr) {
        new Select().calculateTime(arr, Select.class);
    }

    @Override
    protected void internalSort(Integer[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (greater(arr[minIndex], arr[j])) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                exchange(arr,i,minIndex);
            }

        }
    }
}
