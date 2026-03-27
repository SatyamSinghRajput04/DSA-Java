package easy.arrays;

import java.util.HashMap;

public class MaxSumOfDistinctSubArraysWithK {
    public static long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long maxSum = 0;
        long sum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;

        long result = maximumSubarraySum(nums, k);

        System.out.println("Maximum Sum of Distinct Subarray of size " + k + " = " + result);
    }

}
