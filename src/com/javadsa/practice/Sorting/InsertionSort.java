package com.javadsa.practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {4, 5, 2, 1, 3};
//    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(insertionSort(arr)));
  }

  public static int[] insertionSort(int[] arr){

    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j >=1 ; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }else {
          break;
        }
      }

    }
    return arr;
  }
}
