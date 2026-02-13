package easy.arrays;

import java.util.*;

public class NumberOfGoodPairs {

    // ---------- APPROACH 1: Frequency Array (Optimal O(n)) ----------
    public static int numIdenticalPairs(int[] nums) {

        int[] feq = new int[101]; // Assuming values are 0–100
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += feq[nums[i]];
            feq[nums[i]]++;
        }

        return count;
    }

    // ---------- APPROACH 2: Brute Force (O(n²)) ----------
    /*
     * public static int numIdenticalPairs(int[] nums) {
     * 
     * int count = 0;
     * 
     * for (int i = 0; i < nums.length - 1; i++) {
     * for (int j = i + 1; j < nums.length; j++) {
     * if (nums[i] == nums[j]) {
     * count++;
     * }
     * }
     * }
     * 
     * return count;
     * }
     */

    // ---------- MAIN FUNCTION ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (0–100):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = numIdenticalPairs(nums);

        System.out.println("Number of Good Pairs = " + result);

        sc.close();
    }
}
