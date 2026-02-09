package easy.arrays;

// import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    // ✅ MAIN FUNCTION
    public static void main(String[] args) {

        RemoveElement solution = new RemoveElement();

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        int k = solution.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Array after removal: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
