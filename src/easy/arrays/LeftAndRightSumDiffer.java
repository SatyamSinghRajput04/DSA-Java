package easy.arrays;

public class LeftAndRightSumDiffer {

    public static void main(String[] args) {

        int[] nums = { 10, 4, 8, 3 };

        Solution sol = new Solution();

        int[] result = sol.leftRightDifference(nums);

        System.out.print("Output: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {

    public int[] leftRightDifference(int[] nums) {

        int total = 0;
        int n = nums.length;

        for (int num : nums) {
            total += num;
        }

        int leftS = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int rightS = total - leftS - nums[i];

            ans[i] = Math.abs(leftS - rightS);

            leftS += nums[i];
        }

        return ans;
    }
}
