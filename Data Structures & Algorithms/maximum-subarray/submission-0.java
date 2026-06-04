class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; ++i) {
        int temp = 0;

        for (int j = i; j < nums.length; ++j) {
            temp += nums[j];
            maxSum = Math.max(temp, maxSum);
        }
    }

    return maxSum;


    }
}
