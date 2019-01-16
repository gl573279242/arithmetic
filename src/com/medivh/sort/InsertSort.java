package com.medivh.sort;

public class InsertSort {
    public static void main(String[] args) {
        int maxSize=12;
        ArrayIns arr;
        arr=new ArrayIns(maxSize);

        arr.insert(46);
        arr.insert(47);
        arr.insert(24);
        arr.insert(79);
        arr.insert(25);
        arr.insert(84);
        arr.insert(34);
        arr.insert(89);
        arr.insert(77);
        arr.insert(42);
        arr.insert(88);
        arr.insert(48);

        arr.insertionSort();

}
}
