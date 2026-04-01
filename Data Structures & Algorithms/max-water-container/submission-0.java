class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int n=h.length;
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                if(h[i]>h[j]){
                    max=Math.max(max,(j-i)*h[j]);
                }else{
                     max=Math.max(max,(j-i)*h[i]);
                }
            }
        }
        return max;
    }
}
