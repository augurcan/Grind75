package Week1;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices){
        int maxProfit=0;
        int bestTimeToBuy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bestTimeToBuy)
                bestTimeToBuy=prices[i];
            else{
                maxProfit=Math.max(maxProfit,prices[i]-bestTimeToBuy);
            }
        }
        return maxProfit;
    }
}
