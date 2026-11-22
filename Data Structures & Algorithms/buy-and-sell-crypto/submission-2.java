class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int p=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                p=Math.max(prices[r]-prices[l], p);
            }else{
                l=r;
            }
            r++;
        }
        return p;
    }
}
