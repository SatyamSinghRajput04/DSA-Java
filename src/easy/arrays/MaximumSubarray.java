package easy.arrays;

import java.util.*;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxV = nums[0];
        int currS = 0;

        // Optimal Approach: Kadane's Algorithm
        for (int i = 0; i < n; i++) {

            currS += nums[i];

            maxV = Math.max(maxV, currS);

            if (currS < 0) {
                currS = 0;
            }
        }

        return maxV;
    }

    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }

}

/*
 * ------------------------------------------------------------
 * Approach 1: Brute Force
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * 
 * Idea:
 * Check every possible subarray and compute its sum.
 * 
 * int maxV = nums[0];
 * 
 * for(int i = 0; i < n; i++){
 * 
 * int currS = 0;
 * 
 * for(int j = i; j < n; j++){
 * 
 * currS += nums[j];
 * 
 * maxV = Math.max(maxV, currS);
 * }
 * }
 * 
 * return maxV;
 * 
 * ------------------------------------------------------------
 * Approach 2: Kadane's Algorithm (Optimal)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Idea:
 * If the current sum becomes negative,
 * it cannot contribute to a larger future sum,
 * so we reset it to 0.
 * 
 * currS += nums[i]
 * maxV = max(maxV, currS)
 * 
 * if(currS < 0)
 * currS = 0
 * 
 * ------------------------------------------------------------
 */
