package easy.arrays;

public class ReverseVowelOfAString {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            while (l < r && !isVowel(arr[l])) {
                l++;
            }

            while (l < r && !isVowel(arr[r])) {
                r--;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        ReverseVowelOfAString obj = new ReverseVowelOfAString();

        String input1 = "IceCreAm";
        String input2 = "leetcode";

        System.out.println("Input : " + input1);
        System.out.println("Output: " + obj.reverseVowels(input1));

        System.out.println();

        System.out.println("Input : " + input2);
        System.out.println("Output: " + obj.reverseVowels(input2));
    }
}
