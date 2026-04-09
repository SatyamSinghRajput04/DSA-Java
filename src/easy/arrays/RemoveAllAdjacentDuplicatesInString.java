package easy.arrays;

import java.util.*;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeDuplicates(String s) {

        // Optimal Two-Pointer Approach (In-place stack simulation)
        char[] arr = s.toCharArray();
        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            arr[i] = arr[j];

            if (i > 0 && arr[i] == arr[i - 1]) {
                i -= 2; // remove duplicate pair
            }

            i++;
        }

        return new String(arr, 0, i);
    }

    public static void main(String[] args) {

        String s = "abbaca";

        String result = removeDuplicates(s);

        System.out.println("Result after removing duplicates: " + result);
    }
}

/*
 * ------------------------------------------------------------
 * Approach 1: Brute Force using StringBuilder
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 * 
 * Idea:
 * Traverse string and remove adjacent duplicates using delete().
 * 
 * StringBuilder sb = new StringBuilder(s);
 * int i = 0;
 * 
 * while (i < sb.length() - 1) {
 * 
 * if (sb.charAt(i) == sb.charAt(i + 1)) {
 * 
 * sb.delete(i, i + 2);
 * 
 * if (i > 0) {
 * i--;
 * }
 * 
 * } else {
 * i++;
 * }
 * }
 * 
 * return sb.toString();
 * 
 * ------------------------------------------------------------
 * Approach 2: Two Pointer (Optimal)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Idea:
 * Use same array like a stack.
 * 
 * arr[i] = arr[j]
 * If duplicate found:
 * remove previous character
 * move pointer back.
 * 
 * This simulates stack behavior in-place.
 * 
 * ------------------------------------------------------------
 */