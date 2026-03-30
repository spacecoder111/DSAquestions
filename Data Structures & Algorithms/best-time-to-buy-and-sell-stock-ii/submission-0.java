class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int s=0;
        for(int i=1;i<prices.length;i++){
            if(m>prices[i]){
                m=prices[i];
            }else{
                s+=prices[i]-m;
                m=prices[i];
            }
        }
        return s;
    }
}