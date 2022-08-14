package com.javadsa.practice.Sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {4, 5, 2, 1, 3};
    System.out.println(Arrays.toString(selectionSort(arr)));
  }

  public static int findMax(int[] arr, int start, int end) {
    int max = Integer.MIN_VALUE;
    for (int i = start; i <= end; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (max == arr[i]) {
        max = i;
        break;
      }
    }
    return max;
  }

  public static int[] selectionSort(int[] arr) {
    int lastIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      lastIndex =  arr.length-i-1;
      int max = findMax(arr, 0, lastIndex);
      if (arr[max] > arr[lastIndex]){
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[max];
        arr[max] = temp;
      }else {
        break;
      }


    }
    return arr;
  }
}
