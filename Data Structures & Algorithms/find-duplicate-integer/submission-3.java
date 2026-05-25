class Solution {
    public int findDuplicate(int[] nums) {
        int[] temp= new int[nums.length]; 
    for(int i=0;i<nums.length;++i){
            if(temp[nums[i]-1]==-1){
                return nums[i];
            }else{
                temp[nums[i]-1]=-1;
            }
        }
        return -1;
        
    }
}
