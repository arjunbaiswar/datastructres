public class DP_122 {
    public int maxProfit(int[] prices) {
        int res = 0, curr = -1, n = prices.length;
        for (int i = 0; i < n; i++) {
            if (curr == -1 || prices[i] < curr)
                curr = prices[i];
            else {
                if (i + 1 < n && prices[i + 1] > prices[i])
                    continue;
                res += prices[i] - curr;
                curr = -1;
            }
        }
        return res;
    }
}
