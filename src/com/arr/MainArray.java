package com.arr;

public class MainArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
            - trong java thi khong co mang tinh => Toan la mang dong
            - se duoc luu vao bo nho heap
         */

        // khai bao
        System.out.println("============array1=============");
        int[] array1 = new int[5];

        for (int j : array1) {
            System.out.print(j + " ");
        }

        System.out.println("\n============array2=============");
        int[] array2;

        System.out.println("\n===========array3==============");

        int[] array3 = {1, 2, 3, 4, 5};
        for (int i : array3) {
            System.out.print(i + " ");
        }

    }
}
