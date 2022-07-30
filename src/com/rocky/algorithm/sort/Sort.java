package com.rocky.algorithm.sort;

public abstract class Sort<T extends Comparable> {
    protected int exchangeNum = 0;
    protected int compareNum = 0;

    protected abstract void internalSort(T[] arr);

    public boolean greater(T t1, T t2) {
        compareNum++;
        return t1.compareTo(t2) > 0;
    }

    protected void exchange(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        exchangeNum++;
    }

    protected void calculateTime(T[] arr, Class<?> c) {
        long start = System.currentTimeMillis();
        internalSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("【"+c.getSimpleName() + "： 耗时 " + (end - start) + " ms， 交换 "+ exchangeNum+" ， 比较 "+ compareNum+" 】");
    }


}
