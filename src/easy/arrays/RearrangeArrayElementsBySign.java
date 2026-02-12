package easy.arrays;

import java.util.*;

public class RearrangeArrayElementsBySign {

    // Function to rearrange array by sign
    public static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[pos] = nums[i];
                pos = pos + 2;
            } else {
                result[neg] = nums[i];
                neg = neg + 2;
            }
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (positive & negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(nums);

        System.out.println("Rearranged Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
