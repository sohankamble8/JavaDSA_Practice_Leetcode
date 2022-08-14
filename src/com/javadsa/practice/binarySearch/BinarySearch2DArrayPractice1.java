package com.javadsa.practice.binarySearch;

import java.util.Arrays;

public class BinarySearch2DArrayPractice1 {
  public static void main(String[] args) {
    int[][] arr = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
    System.out.println(Arrays.toString(search(arr, 16)));
  }

  public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd-cStart)/2;
      if (matrix[row][mid] == target) {
        return new int[]{row, mid};
      }
      if (matrix[row][mid] > target) {
        cEnd = mid - 1;
      } else {
        cStart=mid+1;
      }

    }
    return new int[]{-1, -1};
  }

  public static int[] search(int[][] matrix, int target){
    int rows = matrix.length;
    int cols = matrix[0].length;
     if(rows==1){
       return binarySearch(matrix, 0, 0, cols - 1, target);
     }

     int rStart =0;
     int rEnd = rows-1;
     int cMid = cols/2;
    while (rStart < rEnd - 1) {
      int rMid = rStart +(rEnd-rStart)/2;
      if (target == matrix[rMid][cMid]) {
        return new int[]{rMid, cMid};
      }
      if (target > matrix[rMid][cMid]) {
        rStart=rMid;
      }else {
        rEnd= rMid;
      }
    }

//     Now we have 2 rows left
//    First we check in middle column values for those 2 rows.
    if (target == matrix[rStart][cMid]) {
      return new int[]{rStart, cMid};
    }
    if (target == matrix[rEnd][cMid]) {
      return new int[]{rEnd, cMid};
    }
//    Checking first half before middle column of 1st row
    if(target < matrix[rStart][cMid]){
      return binarySearch(matrix, rStart, 0, cMid - 1, target);
    }

    //    Checking 2nd half after middle column till first row end
    if (target > matrix[rStart][cMid] && target<= matrix[rStart][cols-1]) {
      return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
    }

    //    Checking 3rd half before middle column of 2nd row
    if (target < matrix[rEnd][cMid]) {
      return binarySearch(matrix, rEnd, 0, cMid - 1, target);
    } else {
      //    Checking 4th half after middle column of 2nd row
      return binarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
    }

  }
}
