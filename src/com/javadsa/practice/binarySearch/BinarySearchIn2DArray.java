package com.javadsa.practice.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2DArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] arr = {
        {10, 20, 30, 40},
        {15, 25, 35, 45},
        {18, 27, 37, 47},
        {19, 29, 39, 49}

    };
    int target = scanner.nextInt();
    System.out.println(Arrays.toString(binarySearchIn2DArray(arr, target)));
  }

  public static int[] binarySearchIn2DArray(int[][] matrix, int target){
    int r = 0;
    int c = matrix.length-1;

    while(r<matrix.length && c >= 0){
      if(matrix[r][c] == target){
        return new int[]{r, c};
      }
      if (matrix[r][c] > target){
        c--;
      }
      else{
        r++;
      }
    }
    return new int[]{-1, -1};
  }
}
