package com.javadsa.practice.binarySearch;

import java.util.Scanner;

public class BinarySearchOnUnkownSortedArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr ={-19, -15, 0, 3, 7, 9, 15, 55, 69, 81};
    int[] arr2 ={99, 81, 78, 75, 55, 31, 15, 7, -12};
    int searchElement = scanner.nextInt();
    int ans = binarySearch(arr2, searchElement);
    System.out.println(ans);
  }

  public static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
//    This boolean variable used to check whether array is sorted ascending or descending sorting order.
    boolean isAsc = arr[start]<arr[end];
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (isAsc) {
        if (arr[mid] < target) {
          start = mid + 1;
        }else {
            end = mid - 1;
          }
      }
      else {
        if (arr[mid] > target) {
          start = mid + 1;
        }else {
          end = mid - 1;
        }
      }
      if (arr[mid] == target) {
        return mid;
      }
    }
//    This returning is used to get Ceiling element if the element is not found
    if (isAsc) {
      return arr[start];
    } else {
      return arr[end];
    }
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
