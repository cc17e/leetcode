class Solution {
    public int maxProfit(int[] prices) {
        int day=prices.length-1;
        int maxima=0,profit=0;
        
        for(int counter=day;counter>=0;counter--){
            if(maxima<=prices[counter])maxima=prices[counter];
            int temp=maxima-prices[counter];
            if(profit<temp)profit=temp;
        }
        return profit;
    }
}
