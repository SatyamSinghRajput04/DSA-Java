package easy.arrays;

import java.util.*;

public class MissingNumber {

    // ----------- ACTIVE APPROACH (SUM METHOD - O(n), O(1)) -----------
    public static int missingNumber(int[] nums) {

        int n = nums.length;

        // Expected sum from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // ----------- APPROACH 2: XOR METHOD (O(n), O(1)) -----------
    /*
     * public static int missingNumber(int[] nums) {
     * 
     * int n = nums.length;
     * int x = n;
     * 
     * for (int i = 0; i < n; i++) {
     * x ^= i;
     * x ^= nums[i];
     * }
     * 
     * return x;
     * }
     */

    // ----------- APPROACH 3: FREQUENCY ARRAY (O(n), O(n)) -----------
    /*
     * public static int missingNumber(int[] nums) {
     * 
     * int n = nums.length;
     * int[] feq = new int[n + 1];
     * 
     * for (int i = 0; i < n; i++) {
     * feq[nums[i]]++;
     * }
     * 
     * for (int i = 0; i <= n; i++) {
     * if (feq[i] == 0) {
     * return i;
     * }
     * }
     * 
     * return -1;
     * }
     */

    // ----------- APPROACH 4: SORTING METHOD (O(n log n)) -----------
    /*
     * public static int missingNumber(int[] nums) {
     * 
     * int n = nums.length;
     * Arrays.sort(nums);
     * 
     * for (int i = 0; i < n; i++) {
     * if (nums[i] != i) {
     * return i;
     * }
     * }
     * 
     * return n;
     * }
     */

    // -------------------- MAIN FUNCTION --------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (range 0 to n):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);

        System.out.println("Missing Number = " + result);

        sc.close();
    }
}
