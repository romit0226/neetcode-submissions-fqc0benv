class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> index= new HashMap<>();

        int[] ans= new int[2];

        for(int i=0;i<nums.length;++i){
            if(index.containsKey(target-nums[i])){
               ans[0]=Math.min(index.get(target-nums[i]),i);
               ans[1]=Math.max(index.get(target-nums[i]),i);
               return ans;
            }
            index.put(nums[i],i);
        }
         return ans;
    }
}
