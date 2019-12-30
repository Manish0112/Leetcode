class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int len=prices.length;
        int buy=-1,sell=-1;
        
        for(int i=0;i<len;i++){
            
            if(i!=len-1 && prices[i]<prices[i+1] && buy==-1){
                System.out.println("buying price"+prices[i]);
                buy=prices[i];
            }
            if(i!=len-1 && prices[i]>prices[i+1] && buy!=-1){
                System.out.println("Selling price"+prices[i]);
                sell=prices[i];
                profit+=sell-buy;
                buy=-1;
            }
            if(i==len-1 && buy!=-1){
                System.out.println("Selling price"+prices[i]);
                sell=prices[i];
                profit+=sell-buy;
                buy=-1;
            }
            
        }
        
        return profit;
    }
}