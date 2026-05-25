class Solution {
    public int findDuplicate(int[] nums) {
     for(int x : nums) {
            if(nums[Math.abs(x)] < 0) return Math.abs(x);
            nums[Math.abs(x)]=-nums[Math.abs(x)];
        }
        return 0;
        
    }
}
