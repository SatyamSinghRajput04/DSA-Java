package easy.arrays;

import java.util.Arrays;

public class BoatsToSavePeople {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;
        int boats = 0;

        while (l <= r) {

            if (people[l] + people[r] <= limit) {
                l++;
            }

            r--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 };
        int limit = 3;

        int result = numRescueBoats(people, limit);
        System.out.println("Minimum number of boats required: " + result);
    }
}
