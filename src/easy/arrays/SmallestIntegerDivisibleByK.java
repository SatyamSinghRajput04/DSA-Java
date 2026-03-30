package easy.arrays;

public class SmallestIntegerDivisibleByK {

    public static int smallestRepunitDivByK(int k) {

        int remainder = 0;

        for (int length = 1; length <= k; length++) {

            remainder = (remainder * 10 + 1) % k;

            if (remainder == 0) {
                return length;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int k = 3;

        int result = smallestRepunitDivByK(k);

        System.out.println("Length: " + result);
    }
}