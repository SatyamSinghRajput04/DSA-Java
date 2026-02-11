package easy.arrays;

public class BestTimeToBuyAndSellStockll {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int total = 0;

        for (int i = 1; i < n; i++) {
            int day = prices[i] - prices[i - 1];
            total += Math.max(day, 0);
        }

        return total;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockll obj = new BestTimeToBuyAndSellStockll();

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 1, 2, 3, 4, 5 };
        int[] prices3 = { 7, 6, 4, 3, 1 };

        System.out.println("Profit 1: " + obj.maxProfit(prices1)); // 7
        System.out.println("Profit 2: " + obj.maxProfit(prices2)); // 4
        System.out.println("Profit 3: " + obj.maxProfit(prices3)); // 0
    }
}
