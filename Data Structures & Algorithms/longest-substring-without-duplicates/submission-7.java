class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       Set<Character> seen= new HashSet<>();
       int ans=0;

        int l=0,r=0;
        while(r<s.length()){
         
         if(seen.contains(s.charAt(r))){

            ans=Math.max(ans,r-l);
            seen.remove(s.charAt(l));
            if(l==r){
              l++;
              r++;
            }else{
                l++;
            }
            
         }else{
            seen.add(s.charAt(r));
            r++;
            ans=Math.max(ans,r-l);
         }


        }
        return ans;
    }
}
