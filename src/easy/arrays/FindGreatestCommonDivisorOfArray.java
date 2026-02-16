package easy.arrays;

class FindGreatestCommonDivisorOfArray {

    public static int findGCD(int[] nums) {

        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        // Find min and max
        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find GCD
        int gcd = 1;

        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 5, 6, 9, 10 };

        int result = findGCD(nums);

        System.out.println("GCD of smallest and largest number: " + result);
    }
}
