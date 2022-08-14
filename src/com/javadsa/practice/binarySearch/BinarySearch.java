package com.javadsa.practice.binarySearch;

import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr ={-19, -15, 0, 3, 7, 9, 15, 55, 69, 81};
    int searchElement = scanner.nextInt();
    int ans = binarySearch(arr, searchElement);
    System.out.println(ans);
  }

  public static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < target) {
        start = mid + 1;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else {
        return mid;
      }
    }
    return arr[start];
    //    for (int i = 0; i <= arr.length; i++) {
    //      int mid = start+(end-start)/2;
    //      if (arr[i] == target) {
    //        return i;
    //      }else if (arr[mid] < target) {
    //        start = mid+1;
    //      } else {
    //        end = mid - 1;
    //      }
    //    }
    //    return -1;
  }
}
