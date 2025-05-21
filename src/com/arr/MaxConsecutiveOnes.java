package com.arr;

public class MaxConsecutiveOnes {
    //  485 Max Consecutive Ones

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     * <p>
     * Example 1:
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     * <p>
     * Example 2:
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     */

    public static class Solution {

        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count = 0;
                } else {
                    count++;
                    max = (max > count) ? max : count;
                    // max = Math.max(max, count);
                }
            }
            return max;
        }

        public static void main(String[] args) {

            int a[] = {1, 1, 0, 1, 1, 1, 1, 1};
            Solution sol = new Solution();
            System.out.println(sol.findMaxConsecutiveOnes(a));

        }
    }
}

