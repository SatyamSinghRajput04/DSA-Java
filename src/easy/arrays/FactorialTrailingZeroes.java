package easy.arrays;

import java.util.Scanner;

public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = trailingZeroes(n);

        System.out.println("Trailing zeroes in " + n + "! = " + result);

        sc.close();
    }
}
