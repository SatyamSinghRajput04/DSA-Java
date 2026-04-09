package easy.arrays;

public class TrappingRainWater {

    public static int trap(int[] height) {

        int n = height.length;
        int l = 0;
        int r = n - 1;

        int lmax = 0;
        int rmax = 0;

        int water = 0;

        // Optimal Two Pointer Approach
        while (l < r) {

            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if (lmax < rmax) {
                water += lmax - height[l];
                l++;
            } else {
                water += rmax - height[r];
                r--;
            }
        }

        return water;
    }

    public static void main(String[] args) {

        int[] height = { 4, 2, 0, 3, 2, 5 };

        int result = trap(height);

        System.out.println("Total trapped water: " + result);
    }
}

/*
 * ------------------------------------------------------------
 * Approach 1: Prefix Max Arrays (Better Approach)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * int[] leftM = new int[n];
 * int[] rightM = new int[n];
 * 
 * leftM[0] = height[0];
 * 
 * for(int i = 1; i < n; i++){
 * leftM[i] = Math.max(leftM[i-1], height[i]);
 * }
 * 
 * rightM[n-1] = height[n-1];
 * 
 * for(int i = n-2; i >= 0; i--){
 * rightM[i] = Math.max(rightM[i+1], height[i]);
 * }
 * 
 * int water = 0;
 * 
 * for(int i = 0; i < n; i++){
 * int minH = Math.min(leftM[i], rightM[i]);
 * water += minH - height[i];
 * }
 * 
 * return water;
 * 
 * ------------------------------------------------------------
 * Approach 2: Brute Force
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * 
 * int water = 0;
 * 
 * for(int i = 1; i < n; i++){
 * 
 * int leftM = 0;
 * int rightM = 0;
 * 
 * for(int j = 0; j <= i; j++){
 * leftM = Math.max(leftM, height[j]);
 * }
 * 
 * for(int j = i; j < n; j++){
 * rightM = Math.max(rightM, height[j]);
 * }
 * 
 * int minH = Math.min(leftM, rightM);
 * 
 * water += minH - height[i];
 * }
 * 
 * return water;
 * 
 * ------------------------------------------------------------
 * Approach 3: Two Pointer (Optimal)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Uses two pointers and keeps track of leftMax and rightMax.
 * Water is trapped based on the smaller boundary.
 * ------------------------------------------------------------
 */
