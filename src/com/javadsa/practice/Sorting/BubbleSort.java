package com.javadsa.practice.Sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int arr[] = {34, 78, 93, 12, 11, 51, 91};
//    int arr2[] = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(bubbleSort(arr)));
  }

  public static int[] bubbleSort(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      boolean isSwapped = false;
      for (int j = 1; j <= arr.length-i-1; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j-1] = temp;
          isSwapped = true;
        }

      }
      if (!isSwapped) {
        break;
      }
    }
    return arr;
  }

}
