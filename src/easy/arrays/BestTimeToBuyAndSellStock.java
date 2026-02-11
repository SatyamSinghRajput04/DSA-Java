package easy.arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] nums) {
        int min = nums[0];
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > min) {
                int diff = nums[i] - min;
                maxDiff = Math.max(maxDiff, diff);
            } else {
                min = nums[i];
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 7, 6, 4, 3, 1 };
        int[] prices3 = { 1, 2, 3, 4, 5 };

        System.out.println("Profit 1: " + obj.maxProfit(prices1)); // 5
        System.out.println("Profit 2: " + obj.maxProfit(prices2)); // 0
        System.out.println("Profit 3: " + obj.maxProfit(prices3)); // 4
    }
}
