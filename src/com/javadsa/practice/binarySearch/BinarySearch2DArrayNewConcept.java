package com.javadsa.practice.binarySearch;

import java.util.Arrays;

public class BinarySearch2DArrayNewConcept {
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
      if (matrix[row][mid] < target) {
        cStart = mid + 1;
      } else {
        cEnd = mid-1;
      }
    }
    return new int[]{-1, -1};
  }

  public static int[] search(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = 0;
    if (matrix[0] != null) {
      cols = matrix[0].length;
    }
    if (rows == 1) {
      return binarySearch(matrix, 0, 0, cols - 1, target);
    }

    int rStart = 0;
    int rEnd = rows-1;
    int cMid = cols/2;
    while (rStart < rEnd - 1) {
      int mid = rStart + (rEnd-rStart)/2;
      if (matrix[mid][cMid] == target){
        return new int[]{mid, cMid};
      }
      if (matrix[mid][cMid] < target) {
        rStart = mid;
      } else {
        rEnd=mid;
      }
    }

//    Now we have 2 rows left
//     Now first we check in Mid column values for these 2 rows
    if (matrix[rStart][cMid] == target) {
      return new int[]{rStart, cMid};
    }
    if (matrix[rStart + 1][cMid] == target) {
      return new int[]{rStart + 1, cMid};
    }

//    Search in first half
    if (target <= matrix[rStart][cMid - 1]) {
      return binarySearch(matrix, rStart, 0, cMid - 1, target);
    }

    //    Search in 2nd half
    if (target <= matrix[rStart+1][cMid - 1]) {
      return binarySearch(matrix, rStart+1, 0, cMid - 1, target);
    }

    //    Search in 3rd half
    if (target >= matrix[rStart][cMid +1] && target <= matrix[rStart][cols-1]) {
      return binarySearch(matrix, rStart, cMid +1, cols-1, target);
    }
    //    Search in 4th half
    else{ /*(target >= matrix[rStart+1][cMid +1] && target <= matrix[rStart][cols-1]) */
      return binarySearch(matrix, rStart+1, cMid +1, cols-1, target);
    }
  }
}
