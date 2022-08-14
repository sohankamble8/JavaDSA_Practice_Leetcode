package com.javadsa.practice.binarySearch;

import java.util.Arrays;

public class BinarySearch2DArrayColumnElimination {
  public static void main(String[] args) {
    /*int[][] arr = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15 ,16}
    };*/

    int[][] arr2 = {
        {1, 5, 9, 13},
        {2, 6, 10, 14},
        {3, 7, 11, 15},
        {4, 8, 12 ,16}
    };
    System.out.println(Arrays.toString(search(arr2, 4)));
  }

  public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd-cStart)/2;
      if (target == matrix[row][mid]) {
        return new int[]{row, mid};
      }
      if (target>matrix[row][mid]){
          cStart = mid+1;
      }else {
        cEnd = mid-1;
      }
    }
    return new int[]{-1, -1};
  }

  public static int[] binarySearchforCol(int[][] matrix, int col, int rStart, int rEnd, int target) {
    while (rStart <= rEnd) {
      int mid = rStart + (rEnd-rStart)/2;
      if (target == matrix[mid][col]) {
        return new int[]{mid, col};
      }
      if (target>matrix[mid][col]){
        rStart = mid+1;
      }else {
        rEnd = mid-1;
      }
    }
    return new int[]{-1, -1};
  }

  public static int[] search(int[][] matrix, int target){
    int rows = matrix.length;
    int cols = 0;
    if (matrix[0]!= null) {
      cols = matrix[0].length;
    }
    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int cStart = 0;
    int cEnd = cols-1;
    int rMid = rows/2-1;
    while (cStart < cEnd - 1) {
      int cMid = cStart + (cEnd-cStart)/2;
      if (target == matrix[rMid][cMid]) {
        return new int[]{rMid, cMid};
      }
      if (target > matrix[rMid][cMid]) {
        cStart = cMid;
      }
      else {
        cEnd = cMid;
      }
    }

//    Now we have 2 columns left
//    First checking for middle row values for those 2 columns
    if (target == matrix[rMid][cStart]) {
      return new int[]{rMid, cStart};
    }
    if (target == matrix[rMid][cEnd]) {
      return new int[]{rMid, cEnd};
    }

//    Now checking for 1st half above mid Row for column 1
    if (target < matrix[rMid][cStart]) {
      return binarySearchforCol(matrix, cStart, 0, rMid - 1, target);
    }

    //    Now checking for 2nd half below mid Row for column 1
    if (target > matrix[rMid][cStart] && target<=matrix[rows-1][cStart]) {
      return binarySearchforCol(matrix, cStart, rMid + 1, rows - 1, target);
    }

    //    Now checking for 3rd half above mid Row for column 2
    if (target < matrix[rMid][cEnd]) {
      return binarySearchforCol(matrix, cEnd, 0, rMid - 1, target);
    }

    //    Now checking for 4th half below mid Row for column 2
    if (target > matrix[rMid][cEnd]) {
      return binarySearchforCol(matrix, cEnd, rMid + 1, rows - 1, target);
    }
    return new int[]{-1, -1};
  }
}
