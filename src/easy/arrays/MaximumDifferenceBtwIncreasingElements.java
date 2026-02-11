package easy.arrays;

public class MaximumDifferenceBtwIncreasingElements {

    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > min) {
                int diff = nums[i] - min;
                maxDiff = Math.max(maxDiff, diff);
            } else {
                min = nums[i];
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        MaximumDifferenceBtwIncreasingElements obj = new MaximumDifferenceBtwIncreasingElements();

        int[] nums1 = { 7, 1, 5, 4 };
        int[] nums2 = { 9, 4, 3, 2 };
        int[] nums3 = { 1, 5, 2, 10 };

        System.out.println("Output 1: " + obj.maximumDifference(nums1)); // 4
        System.out.println("Output 2: " + obj.maximumDifference(nums2)); // -1
        System.out.println("Output 3: " + obj.maximumDifference(nums3)); // 9
    }
}
