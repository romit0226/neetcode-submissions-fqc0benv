class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }

        int k= strs[0].length();
        int temp=0;
        String ans="";

       while(temp<k){
           char tempInside=strs[0].charAt(temp);

           for(int i=1;i<strs.length;++i){
             if(strs[i].length()<=temp){
                 return ans;
             }

            if(strs[i].charAt(temp)!=tempInside){
                return ans;
            }
           }
           ans+=tempInside;
           temp++;

       }

       return ans;

      
    }
}