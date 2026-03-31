package easy.arrays;

public class RangeSumQueryImmutable {

    public static void main(String[] args) {

        int[] nums = { -2, 0, 3, -5, 2, -1 };

        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3
    }
}

class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {

        int n = nums.length;

        prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }
}
