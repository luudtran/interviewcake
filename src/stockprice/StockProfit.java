package stockprice;

public class StockProfit {
	public static int getMaxProfit(int[] stockPricesYesterday) {
		int buyPrice1 = 0;
		int sellPrice1 = 0;
		int profit1 = 0;
		int buyPrice2 = 0;
		int sellPrice2 = 0;
		int profit2 = 0;
		
		int price = stockPricesYesterday[0];
		buyPrice2 = price;
		sellPrice2 = price;
		
		for (int i = 1; i < stockPricesYesterday.length; i++) {
			price = stockPricesYesterday[i];
			
			if (price < buyPrice2) {
				buyPrice2 = price;
				sellPrice2 = price;
				profit2 = 0;
			}
			
			if (price > sellPrice2) {
				sellPrice2 = price;
				profit2 = sellPrice2 - buyPrice2;
				
				if (profit2 > profit1) {
					buyPrice1 = buyPrice2;
					sellPrice1 = sellPrice2;
					profit1 = profit2;
				}
			}
		}
		
		return profit1;
	}
}
