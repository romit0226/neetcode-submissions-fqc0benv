class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr= new int[nums.length*2];
        int k=0;
        while(k<nums.length*2){
        for(int x:nums){
         newArr[k]=x;
         k++;
        }
        }
        return newArr;
    }
}