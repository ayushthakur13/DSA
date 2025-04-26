public class M_buySellStock{

    static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i : prices){

            if(i < minPrice)
                minPrice = i;
            
            int profit = i - minPrice;

            if(profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
        
    }
    public static void main(String[] args){

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
