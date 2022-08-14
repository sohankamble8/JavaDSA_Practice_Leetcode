package com.javadsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int targetSearchElement =  sc.nextInt();
    int[] arr = {5, 13, 19, -90, 41, 34};
    int[][] arr2 = {{5, 13, 19}, {-90, 41, 34}, {13, 12, 8, 55, 15}};

    // Single array Linear Search
    int ans = linearSearch(arr, targetSearchElement);
    System.out.println("Array ->");
    System.out.println(Arrays.toString(arr));
    System.out.println("Element found at Index "+ ans);
    System.out.println();
    System.out.println();

//  2D Array Linear Search
    String ans2 = linearSearch2DArray(arr2, targetSearchElement);
    System.out.println(" 2D Array ->");
    for(int[] array: arr2)
    {
      System.out.println(Arrays.toString(array));
    }
    System.out.println("Element found at Index "+ ans2);
  }
  private static int linearSearch(int[] arr, int targetElement) {

    if (arr.length == 0)
    {
      return -1;
    }
    for (int i=0;i<arr.length;i++) {
      if (arr[i] == targetElement) {
        return i;
      }
    }
    return -1;
  }

  private static String linearSearch2DArray(int[][] arr, int targetElement) {

    if (arr.length == 0)
    {
      return "-1";
    }
    for (int i=0;i<arr.length;i++) {
      for (int j=0;j<arr[i].length;j++)
      {
        if (arr[i][j] == targetElement) {
          return "["+i+", "+j+"]";
        }
      }

    }
    return "-1";
  }
}
