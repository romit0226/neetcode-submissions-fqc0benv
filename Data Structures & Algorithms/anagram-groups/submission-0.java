class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> validAng= new HashMap<>();

        List<List<String>> ans= new ArrayList<>();

        for(String t:strs){
            char[] chars = t.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);

            if(validAng.containsKey(sorted)){
                List<String> list=validAng.get(sorted);
                list.add(t);
                validAng.put(sorted,list);
            }else{
                 List<String> list=new ArrayList<>();
                 list.add(t);
                 validAng.put(sorted,list);
            }
        }

        validAng.forEach((s,list)->{
ans.add(list);
        });

return ans;
    }
}
