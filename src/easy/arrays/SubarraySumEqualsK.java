package easy.arrays;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1 };
        int k = 2;

        Solution sol = new Solution();

        int result = sol.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}

class Solution {

    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int currS = 0;

            for (int j = i; j < n; j++) {

                currS += nums[j];

                if (currS == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
