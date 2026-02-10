package easy.arrays;

public class ValidPalindromell {

    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {

                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromell obj = new ValidPalindromell();

        String s1 = "abca";
        String s2 = "racecar";
        String s3 = "abc";

        System.out.println("Input: " + s1 + " → " + obj.validPalindrome(s1));
        System.out.println("Input: " + s2 + " → " + obj.validPalindrome(s2));
        System.out.println("Input: " + s3 + " → " + obj.validPalindrome(s3));
    }
}
