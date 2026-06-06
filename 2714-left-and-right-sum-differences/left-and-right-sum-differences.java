class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n];
        int[] suffSum = new int[n];

        preSum[0] = 0;
        suffSum[n - 1] = 0;

        for(int i = 1; i < n; i++){
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            suffSum[i] = suffSum[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(preSum[i] - suffSum[i]);
        }

        return nums;
    }
}