package AP_Arrays;

public class Buy_and_Sell_stockes {
	public static int buyAndSellStocks(int[] prices) {
		int buyPrice = Integer.MAX_VALUE;
		int mazProf = 0;
		
		for(int i = 0; i <prices.length; i++) {
			if(buyPrice < prices[i]) {
				int profit = prices[i] - buyPrice;
				mazProf = Math.max(mazProf, profit);
			}
			else {
				buyPrice = prices[i];
			}
		}
		return mazProf;
	}
	
	public static void main(String[] args) {
		int prices[] = {1, 4, 5, 75};
		System.out.println(buyAndSellStocks(prices));
		
	}

}
 