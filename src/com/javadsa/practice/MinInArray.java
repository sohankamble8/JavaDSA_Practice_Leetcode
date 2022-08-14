package com.javadsa.practice;

import java.util.Arrays;

public class MinInArray {
  public static void main(String[] args) {
    int[] arr = {-5, 13, -19, -90, 41, 34};
    int[][] arr2 = {{5, 13, 19}, {90, 41, 34}, {13, 12, 2, 55, 15}};

//    Min In Single Array
    int ans = minElement(arr);
    System.out.println("Min Element from "+ Arrays.toString(arr)+" is "+ans);
    System.out.println();
    System.out.println();

//    Min in 2D Array
    int ans2 = minElement2DArray(arr2);
    for (int[] a : arr2) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println("Min Element from above 2D array is "+ans2);
  }
  private static int minElement(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int min = arr[0];
    for(int i:arr)
    {
      if (i < min) {
        min=i;
      }
    }
    return min;
  }

  private static int minElement2DArray(int[][] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int min = arr[0][0];
    for(int[] i:arr)
    {
      for(int j:i)
      if (j < min) {
        min=j;
      }
    }
    return min;
  }
}
