package com.itheima.joe.test.findmaximumsubarray;

public class FindMaxSubArrayDemo {
    public static void main(String[] args) {
        int[] arr = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] result_arr = findMaximumSubarray(arr, 0, arr.length - 1);
        for (int i = 0; i < result_arr.length; i++) {
            System.out.println(result_arr[i]);
        }
    }
/*
最大数组问题：使用分治策略
    分析：1.要将大数组划分为两个规模尽量相等的子数组，也就是找到大数组的中央位置mid，
         2.求解两个子数组A[low,mid]和A[mid+1,high]
         3，那么所求的最大数组A[i,j]就只用三种情况
            * 第一种情况：完全位于A[low,mid],因此low <= i <= j <= mid;
            * 第二种情况：完全位于A[mid+1,high],因此 mid+1 <= i <= j <= high;
            * 第三种情况：跨越了中点，因此low <= i <= mid j <= high;
         4.可以递归第一种和第二种情况的最大子数组问题，因为两个子问题仍然是最大数组问题，只是规模更小
         5.因此，只要寻找跨越中点的最大子数组
         6.最后进行三者比较选取最大值的问题。
 */
    public static int[] findMaxCrossingSubArray(int[] arr, int low, int mid, int high) {//找出跨越中点最大子数组的方法
        int left_sum = arr[low];//存储左半部的和
        int sum = 0; //存储元素和，来分别与左右半部的和进行比较
        int right_sum = arr[high]; //存取右半部的和
        int max_left = 0; //存取最左边的角标
        int max_right = 0;//存取最右边的角标
        int[] result_arr = new int[3];
        for (int i = mid; i >= low; i--) {
            sum = sum + arr[i];
            if (sum > left_sum) {
                left_sum = sum;
                max_left = i;
            }
        }
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum = sum + arr[i];
            if (sum > right_sum) {
                right_sum = sum;
                max_right = i;
            }
        }
        result_arr[0] = max_left;
        result_arr[1] = max_right;
        result_arr[2] = left_sum + right_sum;
        return result_arr;
    }

    public static int[] findMaximumSubarray(int[] arr, int low, int high) {
        int[] result_arr = new int[3];
        if (high == low) {  //base case: only one element
            result_arr[0] = low;
            result_arr[1] = high;
            result_arr[2] = arr[low];
            return result_arr;
        } else {
            int mid = (low + high) / 2;
            int[] left_result_arr = findMaximumSubarray(arr, low, mid); //第一种情况
            int[] right_result_arr = findMaximumSubarray(arr, mid + 1, high); //第二种情况
            int[] cross_result_arr = findMaxCrossingSubArray(arr, low, mid, high); //第三种情况
            if (left_result_arr[2] >= right_result_arr[2] && left_result_arr[2] >= cross_result_arr[2]) {
                return left_result_arr;
            } else if (right_result_arr[2] >= left_result_arr[2] && right_result_arr[2] >= cross_result_arr[2]) {
                return right_result_arr;
            } else {
                return cross_result_arr;
            }
        }
    }
}
