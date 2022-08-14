package com.javadsa.practice.leetCode;

import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    int[] arr = {-1,-100,3,99};
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
    rotate(arr, 2);
    rotate(arr2, 3);
  }

  public static void rotate(int[] nums, int k) {

    int[] arr = new int[nums.length];
    arr = rotateArray(nums, k);
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
      nums[i] = arr[i];
    }

  }

  public static int[] rotateArray(int[] arr, int steps){
    int len = arr.length;
    int diff = len-steps;
    int[] arr2 = new int[len];
    for(int i=diff;i<len;i++){
      arr2[(i-diff)] = arr[i];
    }
    if(len%2==0){
      for(int i=0;i<diff;i++){
        arr2[diff+i] = arr[i];
      }
    }

    if(len%2!=0){
      for(int i=0;i<diff;i++){
        arr2[diff+i-1] = arr[i];
      }
    }
    return arr2;
  }
}
