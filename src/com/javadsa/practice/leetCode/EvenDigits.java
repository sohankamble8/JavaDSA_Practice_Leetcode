package com.javadsa.practice.leetCode;

import java.util.Arrays;

public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = {13, 191, 123, 1, 3214};
    int count = findNums(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println("Even digits present in above array is "+count);
  }
  private static int findNums(int[] nums) {
    int count=0;
    for (int num : nums) {
      if (even2(num)) {
        count++;
      }
    }
    return count;
  }
  private static boolean even(int num) {
    int count =0;
    if (num<0)
    {
      num=num * -1;
    }
    if (num == 0) {
      return false;
    }
    while(num>0)
    {
      num = num/10;
      count++;
    }
    if (count%2 == 0) {
      return true;
    }
    return false;
  }

//  Faster and optimized method

  private static boolean even2(int num) {
    int count =0;
    if (num<0)
    {
      num=num * -1;
    }
    if (num == 0) {
      return false;
    }
    count = (int)(Math.log10(num))+1;
    if (count%2 == 0) {
      return true;
    }
    return false;
  }
}
