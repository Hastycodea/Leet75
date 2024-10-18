public class MaxProfit {
  public static void main(String[] args) {

    int[] values = {7,1,5,3,6,4};
    System.out.println(maxProfit(values));

  }

  public static int maxProfit(int[] prices) {
    int profit = 0;
    int buyingPrice = prices[0];
    
    for(int i = 1; i < prices.length; i++) {
      if(buyingPrice > prices[i]) {
        buyingPrice = prices[i];
      }
      profit = Math.max(profit, prices[i] - buyingPrice);
    }
    return profit;
  }
}
