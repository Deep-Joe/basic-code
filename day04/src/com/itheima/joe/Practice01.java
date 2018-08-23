package com.itheima.joe;

public class Practice01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 32};
       /* for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        int querry = midQuerr(arr, 6);
        System.out.println(querry);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int midQuerr(int[] arr, int key) {
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min) / 2;
        while (max > min) {
            if (arr[mid] < key) {
                min = mid + 1;
            } else if (arr[mid] > key) {
                max = mid - 1;
            } else {
                return mid;
            }
            mid = (max + min) / 2;
        }
        return -1;
    }
}
