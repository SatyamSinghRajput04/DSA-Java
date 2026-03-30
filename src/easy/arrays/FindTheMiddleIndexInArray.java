package easy.arrays;

public class FindTheMiddleIndexInArray {

    public static void main(String[] args) {

        int[] nums = { 2, 3, -1, 8, 4 };

        Solution sol = new Solution();

        int result = sol.findMiddleIndex(nums);

        System.out.println("Middle Index: " + result);
    }
}

class Solution {

    // Optimal Solution (O(n))
    public int findMiddleIndex(int[] nums) {

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            int right = total - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }

}

/*
 * Brute Force Solution (O(n²))
 * 
 * class Solution {
 * public int findMiddleIndex(int[] nums) {
 * 
 * int n = nums.length;
 * 
 * for(int i = 0; i < n; i++) {
 * 
 * int leftsum = 0;
 * int rightsum = 0;
 * 
 * for(int j = 0; j < i; j++) {
 * leftsum += nums[j];
 * }
 * 
 * for(int j = i + 1; j < n; j++) {
 * rightsum += nums[j];
 * }
 * 
 * if(leftsum == rightsum) {
 * return i;
 * }
 * }
 * 
 * return -1;
 * }
 * }
 */