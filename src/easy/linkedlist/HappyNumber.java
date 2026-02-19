package easy.linkedlist;

import java.util.Scanner;

public class HappyNumber {

    // Method to check if number is happy
    public static boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number.");
        } else {
            System.out.println(n + " is NOT a Happy Number.");
        }

        sc.close();
    }
}
