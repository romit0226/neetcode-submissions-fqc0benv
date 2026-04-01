class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;

        for(int x:prices){
            if(x<min){
                min=x;
            }else{
                ans=Math.max(ans,x-min);
            }
        }

        
        return ans;
    }
}
