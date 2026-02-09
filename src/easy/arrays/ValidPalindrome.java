package easy.arrays;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }

        int l = 0;
        int r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome obj = new ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Input: " + s1);
        System.out.println("Is Palindrome? " + obj.isPalindrome(s1));

        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Is Palindrome? " + obj.isPalindrome(s2));
    }
}
